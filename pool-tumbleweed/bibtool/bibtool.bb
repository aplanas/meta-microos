SUMMARY = "Tool for Manipulating BibTeX Databases"
DESCRIPTION = "BibTool is a tool for manipulating BibTeX databases. BibTeX provides a means to \
integrate citations into LaTeX documents. BibTool allows the manipulation of \
BibTeX files which goes beyond the possibilities - and intentions - of BibTeX."
LICENSE = "GPL-1.0-or-later & CC-BY-SA-3.0"

PV = "2.63"

RPM_NAME = "bibtool-2.63-3.14.aarch64.rpm"
RPM_HASH = "d47d10cb3316d851a05c982aa834ee5fd31c72be4418ec738a5b435c00690ee566ecc28f105a52c8173504fdc0e728df0e2b9c5ad86ee16daf498560fc3ac2ce"

RPROVIDES:${PN} += "bibtool \
bibtool(aarch-64) \
bibtool-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
