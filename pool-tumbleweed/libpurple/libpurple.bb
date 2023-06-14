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

RPM_NAME = "libpurple-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "b539ce42429f90d8e52770e9ad9aabd67b564e072590ec5e02ff24dcdeb636c2c461b0db84ea35f9b67b62b41a172bee5b86d0c2823b4191dae758a01c548532"

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

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/env \
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
