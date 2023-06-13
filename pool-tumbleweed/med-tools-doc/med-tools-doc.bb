SUMMARY = "MED documentation"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "4.1.1"

RPM_NAME = "med-tools-doc-4.1.1-1.6.noarch.rpm"
RPM_HASH = "0475ae3748e1a2c34f5d7f1e6e15d091c774f859e107f13063d457533c9348d4db0f66cb578af0cb98e95a88b5895220b5b86f7a3dd108ffc3b263215624529e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "med-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
