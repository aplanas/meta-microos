SUMMARY = "A GTK patchbay for pipewire"
DESCRIPTION = "Helvum is a GTK-based patchbay for pipewire, inspired by the JACK tool catia."
LICENSE = "(Apache-2.0 | BSL-1.0) & GPL-3.0-only & (Apache-2.0 | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & ISC & MIT"

PV = "0.4.0"

RPM_NAME = "helvum-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "c0262fa86761c81494e566feee34dd6500c4eaf3793dff015d77ee084b7a557f9a5e6581757c53b1f8b5b5c94a98d9b20d820fc1623e6f9387836bac97d02923"

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
