SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python310-lxml-4.9.2-7.1.aarch64.rpm"
RPM_HASH = "d8c632179d8a62d12ac953bb5e9623a0d2f04b4e36bd30cd69a3ca78f8b5f4116f9430d6bacd910604c3485667f93a2b9f4e0511c2c4d4fe660921a761fb1219"

RPROVIDES:${PN} += "python3-lxml \
python3.10dist-lxml \
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
