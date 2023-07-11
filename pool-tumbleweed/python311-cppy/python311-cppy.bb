SUMMARY = "C++ headers for C extension development"
DESCRIPTION = "C++ headers for C extension development"
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-cppy-1.2.1-2.3.noarch.rpm"
RPM_HASH = "598d337fcc7cb53bc69e9168911591e9e4bd5a8c44d8dfb243ca2e0e84629967bb97e29e4ca2688b89802174c4ea1625fe56c8d2eb90b3f5f750f8fbcc6050a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cppy \
python3.11dist-cppy \
python311-cppy \
python3dist-cppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
