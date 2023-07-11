SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "python310-debugpy-1.6.6-4.2.aarch64.rpm"
RPM_HASH = "ed78e8a9181eaf6752c250dff3fd72bb59a1a4f5f3d1442e28d44185d1faa6bdd6b262564b045c2ee6249c4f42599b2776a5f7878aa36b153c27ca19cc9c30c1"

RPROVIDES:${PN} += "python3.10dist-debugpy \
python310-debugpy \
python3dist-debugpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
