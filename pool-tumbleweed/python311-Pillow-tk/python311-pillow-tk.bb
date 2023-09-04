SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python311-Pillow-tk-9.5.0-3.1.aarch64.rpm"
RPM_HASH = "6bc90117f7a7678f51cd0f4e2ba264bf0c7bfcac6d16c4cc64402ac3c809b87206dc29bbaa035d9f0a86cc6e1c15b0aac07afd19ce2fd5a8bd674639479ef85e"

RPROVIDES:${PN} += "python3-Pillow-tk \
python311-Pillow-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Pillow \
python311-tk"

inherit rpm
