SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-tk-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "dcd324693f157dad275b148c71bf76e4ba654b5aace8e4109f2911e3cbbeade026c0ef0b8a4de8cdaba7259e440da9a2c1b7fd0ce7b60fcb3520a6342a5f801c"

RPROVIDES:${PN} += "python39-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python39"

inherit rpm
