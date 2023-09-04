SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python39-Pillow-tk-9.5.0-3.1.aarch64.rpm"
RPM_HASH = "1e492807ba98b45f0ad31e0e837fb499e9f50c2af1173eb62ca85c63c6e450f8610b1da60ff1b9cd84f19b09b83eaa3ab49e023e135511994ab1f9aa6e793163"

RPROVIDES:${PN} += "python39-Pillow-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Pillow \
python39-tk"

inherit rpm
