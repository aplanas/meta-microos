SUMMARY = "Python Geocoding Toolbox"
DESCRIPTION = "Geopy can determine the coordinates of addresses, cities, countries, \
and landmarks using third-party geocoders and other data sources such \
as wikis. \
 \
Geopy currently includes support for six geocoders: Google Maps, Yahoo! Maps, Windows \
Local Live (Virtual Earth), geocoder.us, GeoNames, MediaWiki pages (with the GIS \
extension), and Semantic MediaWiki pages."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-geopy-2.3.0-1.1.noarch.rpm"
RPM_HASH = "3a404db4365b52923e91b8f46e5b68fa7237aff5a788524d0b8d988d7fccea26869522d715cf143484c6cc0a759fb14c244cb9647f52d355f30f28fef6ea7741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geopy \
python310-geopy \
python3dist-geopy"

RDEPENDS:${PN} += "python-abi \
python310-geographiclib"

inherit rpm
