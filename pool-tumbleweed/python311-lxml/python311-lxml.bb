SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python311-lxml-4.9.3-1.1.aarch64.rpm"
RPM_HASH = "a8cf18c2c3ab29ebe64aec3beaead63e93682a93d6f3522ef0ff4466833595e53e14bbf1f9d8079c6427c111e5674184073a7944cf770f22d787e944d63140cb"

RPROVIDES:${PN} += "python3-lxml \
python3.11dist-lxml \
python311-lxml \
python3dist-lxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.2 \
libxslt.so.1 \
python-abi \
python311-cssselect"

inherit rpm
