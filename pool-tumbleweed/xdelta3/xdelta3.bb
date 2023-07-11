SUMMARY = "A diff utility which works with binary files"
DESCRIPTION = "Xdelta3 is a set of tools designed to compute changes between \
binary files.  These changes (delta files) are similar to the output of the \
'diff' program, in that they may be used to store and transmit only the \
changes between files.  The 'delta files' that Xdelta3 manages are \
stored in RFC3284 (VCDIFF) format."
LICENSE = "Apache-2.0 & GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "xdelta3-3.1.0-5.8.aarch64.rpm"
RPM_HASH = "51bb5df7cb85852d073d4e9790fbfce02e329a429583f986d1034d2e9bb9e72ed5ff50f24850f46648fa9c8f16d9b8cf018cc0f335b6b9a27195fe6baaaf9983"

RPROVIDES:${PN} += "xdelta \
xdelta3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libm.so.6"

inherit rpm
