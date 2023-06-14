SUMMARY = "Interactive Tool for Browsing C Source Code"
DESCRIPTION = "Cscope is an interactive, screen-oriented tool that allows the user to \
browse through C source code files for specified elements of code."
LICENSE = "BSD-3-Clause"

PV = "15.9"

RPM_NAME = "cscope-15.9-1.13.aarch64.rpm"
RPM_HASH = "15a25834bc4a0f63c4280fb015f3e0503c3bac17d160a234430cd963491732e4395a63b2f96354908dcede587621dfbb8d808cef776ef7141106d132e5060761"

RPROVIDES:${PN} += "cscope"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
