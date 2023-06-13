SUMMARY = "Versatile Mail Checking Plugin for the Xfce Panel"
DESCRIPTION = "The Mailwatch plugin is a multi-protocol, multi-mailbox mail checking tool \
which supports a variety of protocols and local mailbox formats. It can check \
multiple locations and execute custom actions when it finds new mail."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "xfce4-mailwatch-plugin-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "aa3375879dd446db5188803e0d38cdc36db5953cdeb4efa74979f25a622004167b799f31cd7b356bedaae57683b1cddd38747b3595db3f8adc6335ca57e0592c"

RPROVIDES:${PN} += "libmailwatch.so()(64bit) \
xfce4-mailwatch-plugin \
xfce4-mailwatch-plugin(aarch-64) \
xfce4-panel-plugin-mailwatch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libexo-2.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
xfce4-panel"

inherit rpm
