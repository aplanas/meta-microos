SUMMARY = "GLib-based Instant Messenger Library"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
libpurple is compatible with the following chat networks out of the \
box: Jabber/XMPP, AIM, ICQ, Bonjour, Gadu-Gadu, IRC, SILC, SIMPLE, \
Novell GroupWise Messenger, IBM Sametime, and Zephyr. It can \
support many more with plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-2.14.12-1.4.aarch64.rpm"
RPM_HASH = "10d2e3c6db58794880f445de29f5b96946993eaeb32f5ed11d7f5a934dff9031c5fb0c7639ca8a39ab8ddd422960ae650a7733be1c85f69e253dbc105f8ba33c"

RPROVIDES:${PN} += "libbonjour.so \
libgg.so \
libirc.so \
libjabber.so.0 \
libnovell.so \
libpurple \
libsimple.so \
libxmpp.so \
libzephyr.so \
perl-Purple"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
/usr/bin/sh \
ca-certificates-mozilla \
cyrus-sasl-digestmd5 \
cyrus-sasl-plain \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgadu.so.3 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libidn.so.12 \
libnspr4.so \
libnss3.so \
libperl.so \
libpurple-branding \
libpurple-client.so.0 \
libpurple-client0 \
libpurple0 \
libsasl2.so.3 \
libsmime3.so \
libssl3.so \
libxml2.so.2 \
perl \
python3-dbus-python"

inherit rpm
