SUMMARY = "Image IO for images produced by 2D X-ray detectors"
DESCRIPTION = "FabIO is an I/O library for images produced by 2D X-ray detectors."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.14.0"

RPM_NAME = "python310-fabio-0.14.0-2.5.aarch64.rpm"
RPM_HASH = "360d240cb40d524b494c097d14528211828b22244e22bb323d6fcb2b8df5c30af63b9e861a79c24434eaa6f6a733352412ec5747da8953185d2e60030fd40527"

RPROVIDES:${PN} += "python3-fabio \
python3.10dist-fabio \
python310-fabio \
python3dist-fabio"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
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
