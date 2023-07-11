SUMMARY = "Python package for parsing HTTP/1.1 style headers to objects"
DESCRIPTION = "A Python package for object-oriented HTTP/1.1 style headers. It includes \
a parser and serializer for HTTP headers."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python311-kiss-headers-2.3.1-1.4.aarch64.rpm"
RPM_HASH = "57b3863d47e0655ec8873d9844296372d978155b13f1f50505abbe686a004795cdde81428758b80a43d88bb018eb1253840241bde7291293cf6d1100ca727e0e"

RPROVIDES:${PN} += "python3-kiss-headers \
python3.11dist-kiss-headers \
python311-kiss-headers \
python3dist-kiss-headers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
