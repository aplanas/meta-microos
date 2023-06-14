SUMMARY = "A powerful cross-platform dictionary written in GTK+3"
DESCRIPTION = "StarDict is a cross-platform and international dictionary written in GTK+3. \
 \
It has features such as 'Glob-style pattern matching', 'Scan \
selection word' and 'Fuzzy query'."
LICENSE = "GPL-3.0-only"

PV = "3.0.6"

RPM_NAME = "stardict-3.0.6-1.15.aarch64.rpm"
RPM_HASH = "3dcfcb9a0b95bdd69f5419f38deecae1312dc00a97b18a80cbc62a183e836197e16694ef854a377a71ea516845d1db2054dec2f1fe67cd14c0164328f6509bfb"

RPROVIDES:${PN} += "stardict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libenchant.so.1 \
libespeak-ng.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
