SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python310-Pillow-tk-9.5.0-2.3.aarch64.rpm"
RPM_HASH = "931eaf01b797945a7d708dd3cf1baecb6bbb6ce07a3e998ec4e4203f7d623935eb4aeb872c9c758751cc80811a480a93aea90bdfc3d64c0d43ad8584bc6cf3b4"

RPROVIDES:${PN} += "python310-Pillow-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Pillow \
python310-tk"

inherit rpm
