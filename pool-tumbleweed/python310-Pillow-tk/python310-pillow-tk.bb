SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python310-Pillow-tk-9.5.0-3.1.aarch64.rpm"
RPM_HASH = "5dcc2355dda2504802e8dc265be4df69681114fab143c2bb7c1facc5e26ff63e0ead98457777cbbd4f880178e0e49ecefb399b8dfeb765840c500b6e852f7ad8"

RPROVIDES:${PN} += "python310-Pillow-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Pillow \
python310-tk"

inherit rpm
