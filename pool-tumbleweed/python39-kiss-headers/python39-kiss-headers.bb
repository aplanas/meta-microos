SUMMARY = "Python package for parsing HTTP/1.1 style headers to objects"
DESCRIPTION = "A Python package for object-oriented HTTP/1.1 style headers. It includes \
a parser and serializer for HTTP headers."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python39-kiss-headers-2.3.1-1.4.aarch64.rpm"
RPM_HASH = "d107e0839d47fb70e7c40d64185a05df0824f6fc8040d8ea471fa87f4617e799035e9a44b98f46bd9336501ff0e2d57aae08e33b3245b37baaad3da7c4898944"

RPROVIDES:${PN} += "python3.9dist-kiss-headers \
python39-kiss-headers \
python3dist-kiss-headers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
