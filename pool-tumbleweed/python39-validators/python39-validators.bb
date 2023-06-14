SUMMARY = "Python Data Validation"
DESCRIPTION = "Python Data Validation for Humans."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python39-validators-0.20.0-3.1.noarch.rpm"
RPM_HASH = "628eef464c18ec953a259f08c94a6d942cd8b5bded2c8796bbd66fb75ebc8fa249bfa68cfe016781ef717cd94e0084f68dbc22be0e821c23841e4bd8de52dac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-validators \
python39-validators \
python3dist-validators"

RDEPENDS:${PN} += "python-abi \
python39-decorator"

inherit rpm
