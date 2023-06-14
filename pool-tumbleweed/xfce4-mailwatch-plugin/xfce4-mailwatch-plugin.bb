SUMMARY = "Versatile Mail Checking Plugin for the Xfce Panel"
DESCRIPTION = "The Mailwatch plugin is a multi-protocol, multi-mailbox mail checking tool \
which supports a variety of protocols and local mailbox formats. It can check \
multiple locations and execute custom actions when it finds new mail."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "xfce4-mailwatch-plugin-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "aa3375879dd446db5188803e0d38cdc36db5953cdeb4efa74979f25a622004167b799f31cd7b356bedaae57683b1cddd38747b3595db3f8adc6335ca57e0592c"

RPROVIDES:${PN} += "libmailwatch.so \
xfce4-mailwatch-plugin \
xfce4-panel-plugin-mailwatch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
