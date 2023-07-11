SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.14.2"

RPM_NAME = "python310-bytecode-0.14.2-1.3.noarch.rpm"
RPM_HASH = "a31c321f725350c47f90e98c5931f128b4eafb385b2b63f4c48968ff22003a1dd1833164c985ee4828dd8ac77a90d318e1507341274bcaa0aa3dfe14dd18e910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bytecode \
python310-bytecode \
python3dist-bytecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
