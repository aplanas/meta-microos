SUMMARY = "Python 3 bindings for LibBytesize"
DESCRIPTION = "This package contains Python 3 bindings for LibBytesize making the use of \
the library from Python 3 easier and more convenient."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "python3-libbytesize-2.8-1.2.aarch64.rpm"
RPM_HASH = "41cb3ec5a97cd8f2f250f31b7255b43ac632b2169e942b6637a97bfe43b8b7e5a90d3bd7d646eb00ff3c02753e8e1198ada37077a098c18965f9c2e862f38a5a"

RPROVIDES:${PN} += "python3-libbytesize"

RDEPENDS:${PN} += "libbytesize1 \
python-abi \
python3-six"

inherit rpm
