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

RPM_NAME = "python311-geopy-2.3.0-1.1.noarch.rpm"
RPM_HASH = "f0bbcf3762bbac4c833f09c40d75676de7d55f6b3a723c2155ee9155b6fffc58818cea7727afb1807a1553acb1f4c724b3f11bd225cd22d6b9510d9c7b1c20d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geopy \
python3.11dist-geopy \
python311-geopy \
python3dist-geopy"

RDEPENDS:${PN} += "python-abi \
python311-geographiclib"

inherit rpm
