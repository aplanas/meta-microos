SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-tk-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "17762c873a9728e28fb5aabe851ce8981612051fb091bee662a569c448895044f4330747d7697cbbabcc50112b46d3cffb0894037ea36e93f1354e9742c92e14"

RPROVIDES:${PN} += "python38-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python38"

inherit rpm
