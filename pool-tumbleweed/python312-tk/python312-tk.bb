SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.12.0b4"

RPM_NAME = "python312-tk-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "331126efd4f45ba3a67ff7d7387d8f3f0a31f16452a9287ed01fb8697d5b3292ccd16df37724bd924ed399ac76e13fa3618a8881eaca6d31fa909f7b9b5e10a6"

RPROVIDES:${PN} += "python312-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python312"

inherit rpm
