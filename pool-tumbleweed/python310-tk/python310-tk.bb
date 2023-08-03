SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-tk-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "10c1b3eb5f40cea22247f8a3279ff14024e8280317be27dcb16ebaf678a0deb6fc08686c084a5557d41f0582e5039833578ee024fb23d58358ac8f70b98a21fb"

RPROVIDES:${PN} += "python310-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python310"

inherit rpm
