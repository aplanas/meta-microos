SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python311-lxml-4.9.2-8.1.aarch64.rpm"
RPM_HASH = "850bb26b5bdcdd77eb6ebc1581016d51b84d2a6a8b9420cdadca02ead4fac7bb3f994934804cc423a2d8dfb02e1a81b9a07c5d7d60fdf177fb618c7d56ffb65e"

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
