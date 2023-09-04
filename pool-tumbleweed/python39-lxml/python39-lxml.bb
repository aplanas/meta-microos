SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python39-lxml-4.9.3-1.1.aarch64.rpm"
RPM_HASH = "ed2af3fe4ed3e7d94b847b680be2b56dc526fdd9ad0f7d89e29911f84d7bcd34c730f10abca8780aced33eefea472e969dfb7544ae45534db2758478ca132740"

RPROVIDES:${PN} += "python3.9dist-lxml \
python39-lxml \
python3dist-lxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.2 \
libxslt.so.1 \
python-abi \
python39-cssselect"

inherit rpm
