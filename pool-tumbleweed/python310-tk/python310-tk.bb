SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "python310-tk-3.10.11-1.1.aarch64.rpm"
RPM_HASH = "c0f2ce1acb7a63ddbf860caa194248627298baac72f9bc90b679431d28ddb8c12c40a5a9593ef9c801541cadb268e86cb7602134d9db2531beb8f577df6f2d05"

RPROVIDES:${PN} += "python3-tk \
python310-tk \
python310-tk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtcl8.6.so()(64bit) \
libtk8.6.so()(64bit) \
python(abi) \
python310"

inherit rpm
