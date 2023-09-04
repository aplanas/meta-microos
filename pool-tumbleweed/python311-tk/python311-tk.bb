SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-tk-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "903c6c82e6c59ea786dfa250b11ae3541316cc134b29d4269ccb99969dff25b791cb0bd30ff46fd4c9a53acac434747f1bfe573aa70a36f3a65eabf8d851f142"

RPROVIDES:${PN} += "python3-tk \
python311-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python311"

inherit rpm
