SUMMARY = "Types for the calmjs framework"
DESCRIPTION = "A collection of types (mostly exception classes) for use with |calmjs|_."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-calmjs.types-1.0.1-1.14.noarch.rpm"
RPM_HASH = "116b713af0e3fbaf96335338edce4bd01370656aabf6c706c4de7a53739cc5b4abc401387fdf9f0950dbaf5be01d3f268578e591c5fd52b77914cbc4cb2e8043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(calmjs.types) \
python311-calmjs.types \
python3dist(calmjs.types)"
RDEPENDS:${PN} += "python(abi) \
python311-setuptools"

inherit rpm
