SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.57.0"

RPM_NAME = "python311-numba-devel-0.57.0-1.1.aarch64.rpm"
RPM_HASH = "bbfc0b5ed43de004577fadd6d4ded8f57fd11f3551098e84c91adce0f18c4ff9b463d91ee51a6a26b7f743a6e5f2408475afbca5d1efa8f5d2e0cfaa37ba5f1f"

RPROVIDES:${PN} += "python311-numba-devel \
python311-numba-devel(aarch-64)"

RDEPENDS:${PN} += "(python311-numpy-devel >= 1.21 with python311-numpy-devel < 1.25) \
python(abi) \
python311-devel \
python311-numba"

inherit rpm
