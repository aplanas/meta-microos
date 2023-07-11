SUMMARY = "Image IO for images produced by 2D X-ray detectors"
DESCRIPTION = "FabIO is an I/O library for images produced by 2D X-ray detectors."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.14.0"

RPM_NAME = "python39-fabio-0.14.0-2.7.aarch64.rpm"
RPM_HASH = "ded235ec3233a4c39bd4f53bb5794880b55682dd179a36ebfcd06c0e4f3dd1185aa526ecdece89a7b4a4551c5d9f8181ba04ffb72aa3de7a3255d0ae0ec604a0"

RPROVIDES:${PN} += "python3.9dist-fabio \
python39-fabio \
python3dist-fabio"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Pillow \
python39-h5py \
python39-lxml \
python39-numpy \
python39-qt5 \
update-alternatives"

inherit rpm
