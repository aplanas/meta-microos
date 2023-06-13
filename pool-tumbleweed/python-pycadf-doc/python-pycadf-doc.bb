SUMMARY = "Documentation for the DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "Documentation for the DMTF Cloud Audit (CADF) data model."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python-pycadf-doc-3.1.1-2.5.noarch.rpm"
RPM_HASH = "f408477f889e4973027a36bfc5157ac7c81cf79cea31a2d228af510c50e643fb856b18de000d54e0c4081443b3185544f8bf115b78a45ffdf365342b1f370a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pycadf-doc"

RDEPENDS:${PN} += ""

inherit rpm
