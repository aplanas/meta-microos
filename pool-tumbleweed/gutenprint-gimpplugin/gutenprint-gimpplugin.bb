SUMMARY = "Alternative GIMP print plug-in from the Gutenprint project"
DESCRIPTION = "The enhanced Gutenprint GIMP print plug-in offers an alternative \
with additional capabilities to the plugin supplied with GIMP. \
See the user's manual at /usr/share/gutenprint/doc/gutenprint-users-manual.pdf"
LICENSE = "GPL-2.0-or-later"

PV = "5.3.4"

RPM_NAME = "gutenprint-gimpplugin-5.3.4-1.2.aarch64.rpm"
RPM_HASH = "8155a29d280b2dbe49a1d3f3586190f932de4f5c7e4a35fe8bcc620e3805aa28a7c512001c964ac143fb90c127b7a676085894d7e731602ed1b26987b489f9da"

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
