SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "python311-debugpy-1.6.6-4.2.aarch64.rpm"
RPM_HASH = "6febdb693c657f96487baa93ed1a005b777c7ea926b72bd61c6521ebf03fd11022e727f908b5e25a8c5e9ed8841388c9c108fee3efa20f7887cafa871c1d6f59"

RPROVIDES:${PN} += "python3-debugpy \
python3.11dist-debugpy \
python311-debugpy \
python3dist-debugpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
