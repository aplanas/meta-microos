SUMMARY = "TkInter - Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-tk-2.7.18-36.1.aarch64.rpm"
RPM_HASH = "934999e3376888a12beca6038dbabe59d6aaa1d5ccba82db102bdd54a83dcc098ddeda8921a8f136465b1ab33e60cc6220c430f07fd7a353971c2071707481ce"

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
