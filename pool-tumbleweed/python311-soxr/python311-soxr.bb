SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.5"

RPM_NAME = "python311-soxr-0.3.5-1.3.aarch64.rpm"
RPM_HASH = "26347978b88bf76be9a0d16d54545920ccce594df5b94a0ca5d2a949fe619411a53c6a54df7c928b3ff7e8d8ba7aba9f87c07186b92efc0e54761a7dafb1f803"

RPROVIDES:${PN} += "python3-soxr \
python3.11dist-soxr \
python311-soxr \
python3dist-soxr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsoxr.so.0 \
python-abi \
python311-numpy"

inherit rpm
