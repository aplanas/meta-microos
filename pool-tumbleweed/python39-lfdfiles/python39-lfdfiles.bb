SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2023.4.20"

RPM_NAME = "python39-lfdfiles-2023.4.20-1.3.aarch64.rpm"
RPM_HASH = "a1b270e6050faccbfa51591901ec1078f3521b2fcdabfcee22c932714b191c4a5c819a4f06cb22dd53d4c536582a237f5e3cba9d6b18a060dbb6317e5c1a6a58"

RPROVIDES:${PN} += "python3.9dist-lfdfiles \
python39-lfdfiles \
python3dist-lfdfiles"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi \
python39-click \
python39-czifile \
python39-matplotlib \
python39-netpbmfile \
python39-numpy \
python39-oiffile \
python39-tifffile \
update-alternatives"

inherit rpm
