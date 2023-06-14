SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "python39-debugpy-1.6.6-4.1.aarch64.rpm"
RPM_HASH = "637527329b75cf07548905b33e4291bb4e8cb41af3e343d67a0680f5733959234879446a29975a3edbcd068cf65f874bdac0e4133d60cb2fb0120ad114a11082"

RPROVIDES:${PN} += "python3.9dist-debugpy \
python39-debugpy \
python3dist-debugpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
