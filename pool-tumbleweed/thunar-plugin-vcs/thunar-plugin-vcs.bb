SUMMARY = "Thunar Plugin Providing VCS Integration"
DESCRIPTION = "The Thunar VCS Plugin provides integration with Subversion and GIT VCS and \
makes VCS actions available through the context menu."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "thunar-plugin-vcs-0.2.0-1.24.aarch64.rpm"
RPM_HASH = "7abf512d06f2d4120cce49be6716d50a10424b2023149c9d5f6aede10287a1c2f89073167ece88689f0297906df0d3f21197f4682c026c678785f083a7e509d4"

RPROVIDES:${PN} += "thunar-plugin-vcs \
thunar-vcs-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libsvn-client-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
libthunarx-3.so.0 \
libxfce4util.so.7 \
thunar"

inherit rpm
