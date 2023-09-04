SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-tk-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "304806ef9ed6e67cb045bd8ccf77a5dd9e76bf6d005fd1cc0df339854b8045f7a98b94650105823bfa6082c5eb3501bc1c419375637cb611f65b0ccfdfe9addd"

RPROVIDES:${PN} += "python38-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python38"

inherit rpm
