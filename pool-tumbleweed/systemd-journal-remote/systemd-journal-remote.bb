SUMMARY = "Gateway for serving journal events over the network using HTTP"
DESCRIPTION = "This extends the journal functionality to keep a copy of logs on a \
remote server by providing programs to forward journal entries over \
the network, using encrypted HTTP, and to write journal files from \
serialized journal contents. \
 \
This package contains systemd-journal-gatewayd, \
systemd-journal-remote, and systemd-journal-upload."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-journal-remote-253.7-2.1.aarch64.rpm"
RPM_HASH = "df6a815a0cbe16229a8eb9dc79c74fb030586edb8f32de5da02c67953c5379d79c6ee97a24a7e712242722fac1d100f8ff5121fe08bd53afde93f9ac8f0c83b4"

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
