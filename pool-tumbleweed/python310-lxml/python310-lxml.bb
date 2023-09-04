SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python310-lxml-4.9.3-1.1.aarch64.rpm"
RPM_HASH = "bb9fe923ec4bab27ded6af7cc4e4135708a0306ba77d9dc75439f94ad726c8b7db05b7547c51f00f8f5f9f8b272cfc1129eb4b5fcc69b3c02542e104df44399a"

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
