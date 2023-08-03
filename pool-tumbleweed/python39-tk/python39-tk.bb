SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-tk-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "e45b0214ec561da10957a7f561e5919d87aa448b64d75ac7f4ded4b3aaa96fea69186554e7619dbb23ea9df7669927144957269d36a53aaa0c3f76eca6a74b77"

RPROVIDES:${PN} += "python39-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python39"

inherit rpm
