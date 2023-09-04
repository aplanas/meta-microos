SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-tk-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "334702f2536763dbd764b08d0a3b9d22d6bd9468e851c1a5c6a5e8091b9ac24dbacba8f3aa3840246a29b02ce8bc340f490dc9cf18a697b18d6a5f971c41fad2"

RPROVIDES:${PN} += "python310-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python310"

inherit rpm
