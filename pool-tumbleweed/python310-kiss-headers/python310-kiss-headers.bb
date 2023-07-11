SUMMARY = "Python package for parsing HTTP/1.1 style headers to objects"
DESCRIPTION = "A Python package for object-oriented HTTP/1.1 style headers. It includes \
a parser and serializer for HTTP headers."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python310-kiss-headers-2.3.1-1.4.aarch64.rpm"
RPM_HASH = "d6a0a0c11b8dc90de13f903c823dfe780d710c33130b25e6bed6f45c5825aa4cd497cac75927679d095081dbb33253be5a24cb4c32b3028181e46f70bb67a36b"

RPROVIDES:${PN} += "python3.10dist-kiss-headers \
python310-kiss-headers \
python3dist-kiss-headers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
