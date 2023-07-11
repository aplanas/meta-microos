SUMMARY = "Python cffi bindings for the oniguruma regex engine"
DESCRIPTION = "python cffi bindings for the oniguruma regex engine"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-onigurumacffi-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "3a08f36f13e7e1de490a5ca2b9cab3b8a90472ff7f0da71d6522b43448ebbce37a81918a7f95efb2deac21852347a63199837c7da798e63191c6470775ead3cb"

RPROVIDES:${PN} += "python3.9dist-onigurumacffi \
python39-onigurumacffi \
python3dist-onigurumacffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
python-abi \
python39-cffi"

inherit rpm
