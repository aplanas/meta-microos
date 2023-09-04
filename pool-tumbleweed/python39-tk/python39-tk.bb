SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-tk-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "6ff309e15d48cd393430da0e2b0c6da6a5aa94d3c51be1fa940e93155ad46a13b8d891d6a2e537b6d0eb2d019c4cefb4447e621ba7f70d0607f184d7a4f98235"

RPROVIDES:${PN} += "python39-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python39"

inherit rpm
