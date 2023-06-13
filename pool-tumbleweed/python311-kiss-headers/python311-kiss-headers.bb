SUMMARY = "Python package for parsing HTTP/1.1 style headers to objects"
DESCRIPTION = "A Python package for object-oriented HTTP/1.1 style headers. It includes \
a parser and serializer for HTTP headers."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python311-kiss-headers-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "6b3fb09d53fb089ff39732b0c5ad1ca02e4ee4a5724ddb71f17b1db3cffb4915338beb4317a356d08f5be2bcca5a3c5304cc9810b5016ab51de4ce2ee338b953"

RPROVIDES:${PN} += "python3.11dist(kiss-headers) \
python311-kiss-headers \
python311-kiss-headers(aarch-64) \
python3dist(kiss-headers)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
