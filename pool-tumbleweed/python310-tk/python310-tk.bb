SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.10.13"

RPM_NAME = "python310-tk-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "0d40915a5dd7738b9e714e558cbf9b2290c49f124d758b956b7d80baa9d4d4c24d41363785d17c2b3f88103af9852562b0a1844a3661e881dbd7306de875ab74"

RPROVIDES:${PN} += "python310-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python310"

inherit rpm
