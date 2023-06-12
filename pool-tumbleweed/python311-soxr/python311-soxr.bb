SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.5"

RPM_NAME = "python311-soxr-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "e3445bd1aa67ae69c7d1cadcd8261ff8111fe3f3869ef464ed14fca96e0f7fa03fdf42d71445f0368cbfbc8c25fa71434019adc2315a6eddc2aafa3b159e802b"

RPROVIDES:${PN} += "python3.11dist(soxr) \
python311-soxr \
python311-soxr(aarch-64) \
python3dist(soxr)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsoxr.so.0()(64bit) \
python(abi) \
python311-numpy"

inherit rpm
