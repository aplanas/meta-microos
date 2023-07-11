SUMMARY = "MED documentation"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "med-tools-doc-4.1.1-1.7.noarch.rpm"
RPM_HASH = "27bf0c94bff450681a0a18ca512b6316ec863925863f72e0a9dd91c831821b5888d0aeb89abda453d2afabac860d37f2c00f71bd80563c502174354d81c39655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "med-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
