SUMMARY = "Alternative GIMP print plug-in from the Gutenprint project"
DESCRIPTION = "The enhanced Gutenprint GIMP print plug-in offers an alternative \
with additional capabilities to the plugin supplied with GIMP. \
See the user's manual at /usr/share/gutenprint/doc/gutenprint-users-manual.pdf"
LICENSE = "GPL-2.0-or-later"

PV = "5.3.4"

RPM_NAME = "gutenprint-gimpplugin-5.3.4-1.1.aarch64.rpm"
RPM_HASH = "b15bdcbb09c7416d203862a150a231415e76877d702957f691992ac396a8a87839f647a2be1d25064db9a1a78c902969aa38114d49620aeda7669253b6fa4927"

RPROVIDES:${PN} += "gutenprint-gimpplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpui-2.0.so.0 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libgutenprint.so.9 \
libgutenprintui2.so.2"

inherit rpm
