SUMMARY = "Image IO for images produced by 2D X-ray detectors"
DESCRIPTION = "FabIO is an I/O library for images produced by 2D X-ray detectors."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.14.0"

RPM_NAME = "python311-fabio-0.14.0-2.7.aarch64.rpm"
RPM_HASH = "ab7004c68cb37f6d1cdf98e267ada9a60823c0a19ac8feae3284e1aad944f359cc947bd0deff82a496c1e5860ee211337a1055cee0ab66f77d348504ea69d260"

RPROVIDES:${PN} += "python3-fabio \
python3.11dist-fabio \
python311-fabio \
python3dist-fabio"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Pillow \
python311-h5py \
python311-lxml \
python311-numpy \
python311-qt5 \
update-alternatives"

inherit rpm
