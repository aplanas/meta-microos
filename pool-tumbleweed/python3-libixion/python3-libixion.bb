SUMMARY = "Python bindings for libixion"
DESCRIPTION = "Python 3 bindings for libixion."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python3-libixion-0.17.0-3.5.aarch64.rpm"
RPM_HASH = "f3268468b3b522f1f7bbee1e270b607282ccb5dda21d49825721c308d2511bcd7ecf25ca627edc032a6c2ef3e4dce15f41037f8e79fd93e9b793fb5e33565faa"

RPROVIDES:${PN} += "libixion-python3 \
python3-libixion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0.17.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
