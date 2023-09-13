SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.9.18"

RPM_NAME = "python39-tk-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "d5bd26d2c97a00969480147120ec4736f226a6bc4f6567b915e0a839f8b94d0b366c2702f6b82559e862db3521842e8ef95aac7d60373f813726f28138cdde4c"

RPROVIDES:${PN} += "python39-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python39"

inherit rpm
