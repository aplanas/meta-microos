SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cpp7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "d2f736721b2af8b0dacd298722f3edb5989197674435d777df74e2addfb5b69fe8db1bfb0ad3a05238b3c1952afe738501dc6983d4444db3460b775ed8d3faed"

RPROVIDES:${PN} += "cpp7"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
