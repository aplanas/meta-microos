SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python39-Pillow-tk-9.5.0-2.3.aarch64.rpm"
RPM_HASH = "3e4540a5d91c397edc543907b5a0cec2fbd22986049e2fbaebb02486e671bc7d875702fb06f476930805f6e86700c83858b783bd98255754f7efeeb6975ebc46"

RPROVIDES:${PN} += "python39-Pillow-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Pillow \
python39-tk"

inherit rpm
