SUMMARY = "Types for the calmjs framework"
DESCRIPTION = "A collection of types (mostly exception classes) for use with |calmjs|_."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-calmjs.types-1.0.1-1.14.noarch.rpm"
RPM_HASH = "f780ea81fbd1add6b7db07170d93a728f058816387e22406bfa53db309a74448bd9e52852ee6481939c80ab9cb7ed4b42df22703c19eeca5494dd44d4c872de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(calmjs.types) \
python39-calmjs.types \
python3dist(calmjs.types)"

RDEPENDS:${PN} += "python(abi) \
python39-setuptools"

inherit rpm
