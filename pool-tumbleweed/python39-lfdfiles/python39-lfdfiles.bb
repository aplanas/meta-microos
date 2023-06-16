SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2023.4.20"

RPM_NAME = "python39-lfdfiles-2023.4.20-1.1.aarch64.rpm"
RPM_HASH = "d8b668d1134010a0045d13ec71b83c29e6273d556190c2bdac8017eda51669975f5e43c2877282c2707f278898372bb25e7f245cb84f5a167a08a32c8f548c02"

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
