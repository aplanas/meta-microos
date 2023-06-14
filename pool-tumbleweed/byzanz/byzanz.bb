SUMMARY = "Tool to record a running X desktop to an animated GIF file"
DESCRIPTION = "Byzanz is a simple tool to record a running X desktop to an animated GIF file. \
It is implemented as a GNOME applet. A command line tool for testing purposes \
is also available."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0+git20140619"

RPM_NAME = "byzanz-0.3.0+git20140619-5.9.aarch64.rpm"
RPM_HASH = "ef6825f911ac26320434e72ca7402de72f5a79eb9b0e8b7f1478b4a34e8e17dae0d24970fcc8820e90777c9e41a5ba54d277b72481114a194281cb5068ac1e03"

RPROVIDES:${PN} += "byzanz"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libXdamage.so.1 \
libXfixes.so.3 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
