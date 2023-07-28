SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python310-lxml-4.9.2-8.1.aarch64.rpm"
RPM_HASH = "634e41ba3cbba348d0894bd69dabc3c044f2b6b69c7b14ef476ae1de33bfc94ea331fed61700f075592670743d6530571acd2b7036a19c35a04f3795a022be26"

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
