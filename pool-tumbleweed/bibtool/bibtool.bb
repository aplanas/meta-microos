SUMMARY = "Tool for Manipulating BibTeX Databases"
DESCRIPTION = "BibTool is a tool for manipulating BibTeX databases. BibTeX provides a means to \
integrate citations into LaTeX documents. BibTool allows the manipulation of \
BibTeX files which goes beyond the possibilities - and intentions - of BibTeX."
LICENSE = "GPL-1.0-or-later & CC-BY-SA-3.0"

PV = "2.63"

RPM_NAME = "bibtool-2.63-3.15.aarch64.rpm"
RPM_HASH = "99791f186e0919eb2c54a323f47925417402c2616ed87032e99450deb16fb6f2354d5dc67216a2eab56ad0d0b11be7f4b05ccbd35ee8426bd2cc5f096ce0eb66"

RPROVIDES:${PN} += "bibtool \
bibtool-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
