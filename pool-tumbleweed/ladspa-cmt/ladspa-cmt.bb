SUMMARY = "LADSPA CMT plugins"
DESCRIPTION = "This toolkit is a set of musical sound processing and synthesis tools \
presented as a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin library for CMT (Computer Music Toolkit). \
See the /usr/share/doc/packages/ladspa-cmt directory for documentation."
LICENSE = "GPL-2.0-or-later"

PV = "1.18"

RPM_NAME = "ladspa-cmt-1.18-1.8.aarch64.rpm"
RPM_HASH = "94ecfe11f30e42c5084581b1ded9dc48ef80d619268fbd43630cd522819b70abacb3c3b1d78cf22cb058619bf9e560239282bb3bfa20d4801d7d6d6920b0dfe6"

RPROVIDES:${PN} += "ladspa-cmt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
