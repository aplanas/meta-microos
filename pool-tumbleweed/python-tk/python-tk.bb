SUMMARY = "TkInter - Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-tk-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "1ad4b9822a916e1bf76c9ae3a635d27adf57ebbf2f0481981693d6297f1197ea0db4af333ad17462023b04f75b59fd7d42bc6bbdf52b381c236bff26cfc670a7"

RPROVIDES:${PN} += "pyth-tk \
pyth-tkl \
python-tk \
python-tkinter \
python-tkinter-lib \
python2-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython2.7.so.1.0 \
libtcl8.6.so \
libtk8.6.so \
python-base"

inherit rpm
