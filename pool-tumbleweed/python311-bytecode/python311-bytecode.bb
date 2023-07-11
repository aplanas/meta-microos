SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.14.2"

RPM_NAME = "python311-bytecode-0.14.2-1.3.noarch.rpm"
RPM_HASH = "f6c151c73cdb1d178d2a92cad0bd40325c4109df1f39c15677b74e51a55b3a197880964f9466dc5bc15e56e783035dfa2deec93bb4428eeccc3ff8594052017d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bytecode \
python3.11dist-bytecode \
python311-bytecode \
python3dist-bytecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
