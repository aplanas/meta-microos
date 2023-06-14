SUMMARY = "A diff utility which works with binary files"
DESCRIPTION = "Xdelta3 is a set of tools designed to compute changes between \
binary files.  These changes (delta files) are similar to the output of the \
'diff' program, in that they may be used to store and transmit only the \
changes between files.  The 'delta files' that Xdelta3 manages are \
stored in RFC3284 (VCDIFF) format."
LICENSE = "Apache-2.0 & GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "xdelta3-3.1.0-5.7.aarch64.rpm"
RPM_HASH = "3e981b20038526a76b71062450ee5eb0baf9dee2ea3a8a92f05e77f1d25c5da6a153da2aabf6342c532261fb0378b59e2f21567642e604fc3b9191e383ae0cfa"

RPROVIDES:${PN} += "xdelta \
xdelta3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libm.so.6"

inherit rpm
