SUMMARY = "Image IO for images produced by 2D X-ray detectors"
DESCRIPTION = "FabIO is an I/O library for images produced by 2D X-ray detectors."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.14.0"

RPM_NAME = "python310-fabio-0.14.0-2.7.aarch64.rpm"
RPM_HASH = "04683c4ea6f795228a50bb50284f0e1bfcc4f97374eb094573d9c77712e1e0648b90194793938e9d81314203ff28a16510abcf8437973dc5490ac6fa489513a1"

RPROVIDES:${PN} += "python3.10dist-fabio \
python310-fabio \
python3dist-fabio"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Pillow \
python310-h5py \
python310-lxml \
python310-numpy \
python310-qt5 \
update-alternatives"

inherit rpm
