SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.8.18"

RPM_NAME = "python38-tk-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "0d13c6fc2ab925dbef9bba201c8236126bab00a7017f14c5a3d6bb0d864d9ee5a19f7c7eb4e765a866ad59195e8df49d2ad98f1fdd39fdbdd61d679cf84cfca3"

RPROVIDES:${PN} += "python38-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python38"

inherit rpm
