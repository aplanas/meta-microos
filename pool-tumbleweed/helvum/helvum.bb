SUMMARY = "A GTK patchbay for pipewire"
DESCRIPTION = "Helvum is a GTK-based patchbay for pipewire, inspired by the JACK tool catia."
LICENSE = "(Apache-2.0 | BSL-1.0) & GPL-3.0-only & (Apache-2.0 | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & ISC & MIT"

PV = "0.4.0"

RPM_NAME = "helvum-0.4.0-1.4.aarch64.rpm"
RPM_HASH = "26618db7db636502da60c1f2e5267f3edecf5ca1ccbd832d184de11a0194e6d18e542bd0b8692a4104d6738f6a66bfc4d23e614bfa6f4367add03a5bd0b64891"

RPROVIDES:${PN} += "helvum"

RDEPENDS:${PN} += "libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpipewire-0.3.so.0"

inherit rpm
