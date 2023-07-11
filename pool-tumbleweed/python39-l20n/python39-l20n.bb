SUMMARY = "Python L20n library"
DESCRIPTION = "L20n mozilla markings for translations. \
 \
Better solution today is to use python fluent module."
LICENSE = "Apache-2.0"

PV = "4.0.0a1"

RPM_NAME = "python39-l20n-4.0.0a1-2.4.noarch.rpm"
RPM_HASH = "94bb9ad6967d06fd22195104c4a0c92737769dc28a03e6cf5b67ef8e1c401f0559aa3999ee2c594655e643417b4a8cffcf4b43da245bf2c616dce1c32528796f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-l20n \
python39-l20n \
python3dist-l20n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
