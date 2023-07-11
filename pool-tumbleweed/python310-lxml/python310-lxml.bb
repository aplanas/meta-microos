SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python310-lxml-4.9.2-7.3.aarch64.rpm"
RPM_HASH = "c597d0b6a10cf67042ca5c6851ab19c769f9a633007afcc5598551348371ca8d78f67cdc1c5fbf37c28915a2b221da64e5829dcc7f6a24845929f75ef15c9c0a"

RPROVIDES:${PN} += "python3.10dist-lxml \
python310-lxml \
python3dist-lxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.2 \
libxslt.so.1 \
python-abi \
python310-cssselect"

inherit rpm
