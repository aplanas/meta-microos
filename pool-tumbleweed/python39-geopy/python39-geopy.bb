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

RPM_NAME = "python39-geopy-2.2.0-2.3.noarch.rpm"
RPM_HASH = "5d205e45688e565fe6db1dc722a85129ae4ae27dd508e73924faf3b7a25a15ba4932f4fe795019f921d81301b5cf628e8418a41dc87cd92192de230f50c3bc32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(geopy) \
python39-geopy \
python3dist(geopy)"
RDEPENDS:${PN} += "python(abi) \
python39-geographiclib"

inherit rpm
