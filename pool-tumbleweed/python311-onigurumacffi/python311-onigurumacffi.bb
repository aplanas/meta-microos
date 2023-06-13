SUMMARY = "Python cffi bindings for the oniguruma regex engine"
DESCRIPTION = "python cffi bindings for the oniguruma regex engine"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-onigurumacffi-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "f7eac86eb6d20106522a9bd8fcda8f3b53b077229134413ccaecff867acbb7cecc0ed1444ba648ed74f562c5560e3f497f0806791d060622f6712995af4e03e3"

RPROVIDES:${PN} += "python3.11dist(onigurumacffi) \
python311-onigurumacffi \
python311-onigurumacffi(aarch-64) \
python3dist(onigurumacffi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libonig.so.5()(64bit) \
python(abi) \
python311-cffi"

inherit rpm
