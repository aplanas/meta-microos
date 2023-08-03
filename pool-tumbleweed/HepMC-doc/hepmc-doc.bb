SUMMARY = "API documentation for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the API documentation for the HepMC library."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "HepMC-doc-3.2.6-1.1.noarch.rpm"
RPM_HASH = "f964c368736383062fea79f17f895c0ecbc54ae5680a97cbd76cd2bbd9ab638c890b9f88f23a8f8f2ccafe0151cd382c7ff884b925aefa5697b3a0f6932bdc36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HepMC-doc"

RDEPENDS:${PN} += ""

inherit rpm
