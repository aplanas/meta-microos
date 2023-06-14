SUMMARY = "Python Geocoding Toolbox"
DESCRIPTION = "Geopy can determine the coordinates of addresses, cities, countries, \
and landmarks using third-party geocoders and other data sources such \
as wikis. \
 \
Geopy currently includes support for six geocoders: Google Maps, Yahoo! Maps, Windows \
Local Live (Virtual Earth), geocoder.us, GeoNames, MediaWiki pages (with the GIS \
extension), and Semantic MediaWiki pages."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-geopy-2.2.0-2.3.noarch.rpm"
RPM_HASH = "631302e3ffa8ec281ebf1fbb894796f47e2bc78b3988202624864841f16ae68be8a4c4bfc5024a708c0e4826aec7fb8abc156610a8fea7c4d733f248d8e23811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-geopy \
python311-geopy \
python3dist-geopy"

RDEPENDS:${PN} += "python-abi \
python311-geographiclib"

inherit rpm
