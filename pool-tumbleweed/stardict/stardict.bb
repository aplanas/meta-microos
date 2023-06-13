SUMMARY = "A powerful cross-platform dictionary written in GTK+3"
DESCRIPTION = "StarDict is a cross-platform and international dictionary written in GTK+3. \
 \
It has features such as 'Glob-style pattern matching', 'Scan \
selection word' and 'Fuzzy query'."
LICENSE = "GPL-3.0-only"

PV = "3.0.6"

RPM_NAME = "stardict-3.0.6-1.15.aarch64.rpm"
RPM_HASH = "3dcfcb9a0b95bdd69f5419f38deecae1312dc00a97b18a80cbc62a183e836197e16694ef854a377a71ea516845d1db2054dec2f1fe67cd14c0164328f6509bfb"

RPROVIDES:${PN} += "application() \
application(stardict.desktop) \
stardict \
stardict(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libenchant.so.1()(64bit) \
libespeak-ng.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
