SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "python310-debugpy-1.6.6-4.1.aarch64.rpm"
RPM_HASH = "daa2d0ce372bbb2689d43ad985a3e687ea823e1021acb081b5aa040ba5eed51d01e3d5491f6b8a87059106e849fbc1fd96199c37bee4eb7424017b19ac5a5d4b"

RPROVIDES:${PN} += "python3-debugpy \
python3.10dist-debugpy \
python310-debugpy \
python3dist-debugpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
