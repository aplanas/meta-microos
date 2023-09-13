SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python39-lxml-4.9.3-2.1.aarch64.rpm"
RPM_HASH = "f9d34a5892055138189188b8f7f92b918b8a7c9a0d67804d9f2d1b75fc01da40bbe9efe887dc14822fdd0d773a1887180e7bdc3ef6da9eb2368f70e65967f4e7"

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
