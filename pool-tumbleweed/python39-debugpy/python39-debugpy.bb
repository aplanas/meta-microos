SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "python39-debugpy-1.6.6-4.2.aarch64.rpm"
RPM_HASH = "8e8450d8370042e406c25e9a47acca3ad4420f43c01995d946b4a943d98505e14310f42df35a5f502c3bcbb8fe9236700254953731509558df051f0c9d6e97a4"

RPROVIDES:${PN} += "python3.9dist-debugpy \
python39-debugpy \
python3dist-debugpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
