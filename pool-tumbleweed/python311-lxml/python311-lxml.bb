SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python311-lxml-4.9.2-7.3.aarch64.rpm"
RPM_HASH = "35e114c64a28295921cd70c399ffdc433bf3924c300ae4747d4495b0d8bacaaec870631c662d0fd5e05bdf2932c60ba3b7b0877abb73d3519a595fe6f91fc7c3"

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
