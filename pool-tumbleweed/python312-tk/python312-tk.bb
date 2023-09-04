SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.12.0rc1"

RPM_NAME = "python312-tk-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "672c527eb9226f21deedb18379f76cb9477fd45c7c3241d0b71af850d8848b7e7569f8771321090e3f1941e272d638d618e2771d9ab4a52661fee65a18911f71"

RPROVIDES:${PN} += "python312-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python312"

inherit rpm
