SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python39-lxml-4.9.2-7.3.aarch64.rpm"
RPM_HASH = "2f16de399b800eba0ff5901da1819147a04c0df1bc6549fa782e46662d2116d729d37b92153bfdf7157b5672e6840091350154e2fd57bcbc24bd6489dc0fe805"

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
