SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "python312-tk-3.12.0b1-1.1.aarch64.rpm"
RPM_HASH = "6847156fe75533db58a26a324bfda0b5c17e541486c8700a21b04df28c71244a30022ea3431f2c1bf5bfc9f8a7fc07f502a8f7db7ca3ff3baa7f29a8c276f626"

RPROVIDES:${PN} += "python312-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python312"

inherit rpm
