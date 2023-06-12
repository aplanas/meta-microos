SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cpp7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "d2f736721b2af8b0dacd298722f3edb5989197674435d777df74e2addfb5b69fe8db1bfb0ad3a05238b3c1952afe738501dc6983d4444db3460b775ed8d3faed"

RPROVIDES:${PN} += "cpp7 cpp7(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit)"

inherit rpm
