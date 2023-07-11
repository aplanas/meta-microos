SUMMARY = "Python cffi bindings for the oniguruma regex engine"
DESCRIPTION = "python cffi bindings for the oniguruma regex engine"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-onigurumacffi-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "86961965474c0bab22028ae0b0191c9ffdc74ab37763df57fb41bfc109dfd8c8439dade35be3fdf67ee70e6da487eb649ea0848407e4eff1a425d55206bf3573"

RPROVIDES:${PN} += "python3-onigurumacffi \
python3.11dist-onigurumacffi \
python311-onigurumacffi \
python3dist-onigurumacffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
python-abi \
python311-cffi"

inherit rpm
