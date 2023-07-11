SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-tk-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "f853917735c5ecf9893a4030d3c593f46ef61609c60937d868c95e817018ff899272773e031a609fd64af5f89ade123ff55e2445a9270ef9c7fbde64ac53b8f1"

RPROVIDES:${PN} += "python39-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python39"

inherit rpm
