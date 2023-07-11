SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2023.4.20"

RPM_NAME = "python311-lfdfiles-2023.4.20-1.3.aarch64.rpm"
RPM_HASH = "c66a02b7dcb909597edf4d4935958366080260604409270b3f74ebb31f77d840a29bce1a77a6dcb5ea767d2f66bc012a674b0f78a988979c314179daa21b9085"

RPROVIDES:${PN} += "python3-lfdfiles \
python3.11dist-lfdfiles \
python311-lfdfiles \
python3dist-lfdfiles"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi \
python311-click \
python311-czifile \
python311-matplotlib \
python311-netpbmfile \
python311-numpy \
python311-oiffile \
python311-tifffile \
update-alternatives"

inherit rpm
