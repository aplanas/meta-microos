SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2023.4.20"

RPM_NAME = "python311-lfdfiles-2023.4.20-1.1.aarch64.rpm"
RPM_HASH = "d9c05e5ff129b0ea223b993e2d43b02d4f6425f0cbbe9b4c37a643a895e2575f1bd3888fa6d1d3be5b94dcd7cd893a7fe80cad3c32f2ea8b1d552c35b2f3d6d1"

RPROVIDES:${PN} += "python3.11dist-lfdfiles \
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
