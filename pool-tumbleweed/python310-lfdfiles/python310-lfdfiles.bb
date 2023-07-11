SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2023.4.20"

RPM_NAME = "python310-lfdfiles-2023.4.20-1.3.aarch64.rpm"
RPM_HASH = "a811ead367c9e3af31c3cbf59dcb658c8f746f761f44021417a695ad8aa11257d2d10c243b21ad37818672962d2af8feb556dd45878be42762bbed61c655cfc6"

RPROVIDES:${PN} += "python3.10dist-lfdfiles \
python310-lfdfiles \
python3dist-lfdfiles"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi \
python310-click \
python310-czifile \
python310-matplotlib \
python310-netpbmfile \
python310-numpy \
python310-oiffile \
python310-tifffile \
update-alternatives"

inherit rpm
