SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python311-lxml-4.9.3-2.1.aarch64.rpm"
RPM_HASH = "6c48bbad9e491b74c35b17d34d5f1fbcd4ca806448f5ae8b144697c9aac461e6ede4e8c8ee480f58185adef84c505fa4c61af80282c11832f8ace4da8be30cc6"

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
