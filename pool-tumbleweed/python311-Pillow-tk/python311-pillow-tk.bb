SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python311-Pillow-tk-9.5.0-2.3.aarch64.rpm"
RPM_HASH = "e9ed84be826f854bfb2f36766d5d20e2bba3794cdc4f4c77253641e2e77208a4d50d59cd62caa8940e4daef9c54046ab9a425354a5708f77f4f766b79c2aea41"

RPROVIDES:${PN} += "python3-Pillow-tk \
python311-Pillow-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Pillow \
python311-tk"

inherit rpm
