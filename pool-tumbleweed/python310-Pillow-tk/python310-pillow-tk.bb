SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python310-Pillow-tk-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "38675a21cd6755b87b70460e066f089447687ef0d387b8b109d2af6de4488ae441f3f13e788407ee6044e9db94d51e8fa9a815389c3684afe2e0ccf080fc40e9"

RPROVIDES:${PN} += "python3-Pillow-tk \
python310-Pillow-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Pillow \
python310-tk"

inherit rpm
