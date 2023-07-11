SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.12.0b3"

RPM_NAME = "python312-tk-3.12.0b3-1.1.aarch64.rpm"
RPM_HASH = "628d492b3a525823305e2b0facc6a20c9e28a2ac313636c8db5a14e1eb66de0f1961003ff37aa7830e88e040e9527e461caee508a197be3c571836e04f7301c0"

RPROVIDES:${PN} += "python312-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python312"

inherit rpm
