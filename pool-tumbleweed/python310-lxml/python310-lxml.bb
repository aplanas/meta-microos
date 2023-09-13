SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python310-lxml-4.9.3-2.1.aarch64.rpm"
RPM_HASH = "003c6a2e75cad58ee2d8aca4f4f76049fcac2482eb61ecf18fb320b1131aec24115ba2217905820d6bdda22ac2973e90ab47af6d6be1e091a901ef0728e5da4a"

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
