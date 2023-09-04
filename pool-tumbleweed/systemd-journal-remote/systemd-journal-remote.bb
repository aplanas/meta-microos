SUMMARY = "Gateway for serving journal events over the network using HTTP"
DESCRIPTION = "This extends the journal functionality to keep a copy of logs on a \
remote server by providing programs to forward journal entries over \
the network, using encrypted HTTP, and to write journal files from \
serialized journal contents. \
 \
This package contains systemd-journal-gatewayd, \
systemd-journal-remote, and systemd-journal-upload."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-journal-remote-253.8-1.2.aarch64.rpm"
RPM_HASH = "9a172f8908b194564acac5462bb04348928bb21d1e6b8aac4a2b24855e8a48be29f44513e2afb7b48a6c59309482c9651bc1fb474ad5a79c98fb10d977c43b05"

RPROVIDES:${PN} += "config-systemd-journal-remote \
systemd-journal-remote"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgnutls.so.30 \
libmicrohttpd.so.12 \
libsystemd-shared-253.so \
systemd"

inherit rpm
