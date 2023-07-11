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

RPM_NAME = "python39-geopy-2.3.0-1.1.noarch.rpm"
RPM_HASH = "40f3fd04add0ae8a27e80600aadb87c042b66a21cc78dfc7abf8c8181e8a4b36132ef1320db984d679ea6877ccfa18008135f9bcdbe7aab56acfde0d27bb36cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geopy \
python39-geopy \
python3dist-geopy"

RDEPENDS:${PN} += "python-abi \
python39-geographiclib"

inherit rpm
