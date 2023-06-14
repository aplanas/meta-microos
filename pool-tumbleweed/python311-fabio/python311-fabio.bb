SUMMARY = "Image IO for images produced by 2D X-ray detectors"
DESCRIPTION = "FabIO is an I/O library for images produced by 2D X-ray detectors."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.14.0"

RPM_NAME = "python311-fabio-0.14.0-2.5.aarch64.rpm"
RPM_HASH = "a08f1784290d0ddbfd695f18af6514631c8c281fbdb9b87fdb418330117e3d32e5e1c047d395949efdc70666ae02f89603826a5a1fc098b02be97d1aeeb92e69"

RPROVIDES:${PN} += "python3.11dist-fabio \
python311-fabio \
python3dist-fabio"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
