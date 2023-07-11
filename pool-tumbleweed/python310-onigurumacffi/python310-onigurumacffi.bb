SUMMARY = "Python cffi bindings for the oniguruma regex engine"
DESCRIPTION = "python cffi bindings for the oniguruma regex engine"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-onigurumacffi-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "f8067f81e90d47c4b02626f5a92c1ff5c95df29a64ac3ee5abff5e0a2607101f3e72b45ea6527a40025bed80beae8a8fe30be0bb2d465f2aa50fb0e89e77be89"

RPROVIDES:${PN} += "python3.10dist-onigurumacffi \
python310-onigurumacffi \
python3dist-onigurumacffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
python-abi \
python310-cffi"

inherit rpm
