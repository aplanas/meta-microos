SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "python310-libcaes-20230406-1.1.aarch64.rpm"
RPM_HASH = "6a29bb36e67be077f7c02086811e8d04e6825fd7d75b9aea23b70e73a4f93682fb11b8dd6f83ecef45011e5bc50b2d181e881b0ffd8c4e1cf2e17679bd67a447"

RPROVIDES:${PN} += "python3-libcaes \
python310-libcaes \
python310-libcaes(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcaes.so.1()(64bit) \
libcaes.so.1(V_20230406)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
python(abi)"

inherit rpm
