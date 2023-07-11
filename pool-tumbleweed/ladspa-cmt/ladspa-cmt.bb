SUMMARY = "LADSPA CMT plugins"
DESCRIPTION = "This toolkit is a set of musical sound processing and synthesis tools \
presented as a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin library for CMT (Computer Music Toolkit). \
See the /usr/share/doc/packages/ladspa-cmt directory for documentation."
LICENSE = "GPL-2.0-or-later"

PV = "1.18"

RPM_NAME = "ladspa-cmt-1.18-1.9.aarch64.rpm"
RPM_HASH = "cc2071fadd730885334477acac07e45a405613358e48b6aceb5ffb93acb70353a6c6ce994e43c99606d04a2361c2d6e432d59790a0df9870e1ea7b876e6e989f"

RPROVIDES:${PN} += "ladspa-cmt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
