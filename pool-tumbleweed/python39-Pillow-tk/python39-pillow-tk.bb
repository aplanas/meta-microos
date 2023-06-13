SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python39-Pillow-tk-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "b44474c9bd1baae9085448929b128812892c349e5b3d6ac09757898ef5adfbfff2ab79e06e01a1c0f98bab9c8c085d99e23e4895fa789473fe955b1cffa22e64"

RPROVIDES:${PN} += "python39-Pillow-tk \
python39-Pillow-tk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
python(abi) \
python39-Pillow \
python39-tk"

inherit rpm
