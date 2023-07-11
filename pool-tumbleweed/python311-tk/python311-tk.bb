SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-tk-3.11.4-1.1.aarch64.rpm"
RPM_HASH = "f7a8d0d942a60eddbcecb9a03909b36064a97b38045c9e1c4a8290ef327fc6dc8205cc8ae789a2442b60e3ce94c11286804d7c4a2652f6574ed3c1ddcdf533b1"

RPROVIDES:${PN} += "python3-tk \
python311-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python311"

inherit rpm
