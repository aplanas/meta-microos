SUMMARY = "Python package for parsing HTTP/1.1 style headers to objects"
DESCRIPTION = "A Python package for object-oriented HTTP/1.1 style headers. It includes \
a parser and serializer for HTTP headers."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python310-kiss-headers-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "804874ab21030125240542e964620621c84fc934dc177f3b41bf5f40639b6baf59e9e3c08fffbffe4d0c30fe02c29a4fbf339e626b8a3531315ff9d8660c5bde"

RPROVIDES:${PN} += "python3-kiss-headers \
python3.10dist(kiss-headers) \
python310-kiss-headers \
python310-kiss-headers(aarch-64) \
python3dist(kiss-headers)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
