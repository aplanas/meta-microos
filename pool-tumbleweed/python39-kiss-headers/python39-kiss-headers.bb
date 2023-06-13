SUMMARY = "Python package for parsing HTTP/1.1 style headers to objects"
DESCRIPTION = "A Python package for object-oriented HTTP/1.1 style headers. It includes \
a parser and serializer for HTTP headers."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python39-kiss-headers-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "a85c30155755775b2a95872c4f94a6f00951beef3c23a04d86e037f1277da51445975b24528c6be5b1f1ec26e17b353ef5d6a98b7da7d2f0aed4091ce2b92b1c"

RPROVIDES:${PN} += "python3.9dist(kiss-headers) \
python39-kiss-headers \
python39-kiss-headers(aarch-64) \
python3dist(kiss-headers)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
