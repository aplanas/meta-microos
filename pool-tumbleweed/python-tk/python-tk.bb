SUMMARY = "TkInter - Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-tk-2.7.18-37.1.aarch64.rpm"
RPM_HASH = "14a6918018f1b45b835a814ed66f44b0ce394d66a27f1e2e11b9116eff3646061eeb3d304689996167bdce3baedcb60f718112207915d811990021a24efa8263"

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
