SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.5"

RPM_NAME = "python39-soxr-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "43fb8b29038cf02376813836c6679b1d2fe85b4f2c2047da239fada6148a9e6ac5571b307c596ef2f3f4fbefd9f4cae5433c0a8fcc231f9a9942e25eb4de7db5"

RPROVIDES:${PN} += "python3.9dist(soxr) \
python39-soxr \
python39-soxr(aarch-64) \
python3dist(soxr)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsoxr.so.0()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
