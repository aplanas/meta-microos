SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-tk-3.10.12-1.1.aarch64.rpm"
RPM_HASH = "bcd30c89882cb4066369a82b6449fd317d56127f7ec9c60f63569b1848d722d58e495f1ef219956c429dabe7d60a093112e7bd270c7aeb00effce750125d7cb2"

RPROVIDES:${PN} += "python310-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python310"

inherit rpm
