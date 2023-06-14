SUMMARY = "Python cffi bindings for the oniguruma regex engine"
DESCRIPTION = "python cffi bindings for the oniguruma regex engine"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-onigurumacffi-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "484a5ad9cdbb0c9890d334fb23c215fd59920fd56d1b548b687769c14a082c013e44d362dc395d95b5e025c69baf71ac55db8d0ebccfcacb90c6ea1ff367e307"

RPROVIDES:${PN} += "python3-onigurumacffi \
python3.10dist-onigurumacffi \
python310-onigurumacffi \
python3dist-onigurumacffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
python-abi \
python310-cffi"

inherit rpm
