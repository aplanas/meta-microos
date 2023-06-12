SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2023.4.20"

RPM_NAME = "python39-lfdfiles-2023.4.20-1.1.aarch64.rpm"
RPM_HASH = "d8b668d1134010a0045d13ec71b83c29e6273d556190c2bdac8017eda51669975f5e43c2877282c2707f278898372bb25e7f245cb84f5a167a08a32c8f548c02"

RPROVIDES:${PN} += "python3.9dist(lfdfiles) \
python39-lfdfiles \
python39-lfdfiles(aarch-64) \
python3dist(lfdfiles)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgomp.so.1(OMP_3.0)(64bit) \
python(abi) \
python39-click \
python39-czifile \
python39-matplotlib \
python39-netpbmfile \
python39-numpy \
python39-oiffile \
python39-tifffile \
update-alternatives"

inherit rpm
