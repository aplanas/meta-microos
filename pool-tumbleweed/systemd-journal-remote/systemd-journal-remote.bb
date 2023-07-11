SUMMARY = "Gateway for serving journal events over the network using HTTP"
DESCRIPTION = "This extends the journal functionality to keep a copy of logs on a \
remote server by providing programs to forward journal entries over \
the network, using encrypted HTTP, and to write journal files from \
serialized journal contents. \
 \
This package contains systemd-journal-gatewayd, \
systemd-journal-remote, and systemd-journal-upload."
LICENSE = "LGPL-2.1-or-later"

PV = "253.5"

RPM_NAME = "systemd-journal-remote-253.5-5.1.aarch64.rpm"
RPM_HASH = "01a58bbfdbd459d3982b953482ab7c5263e989b916daca90f2f363a81a7dcd57285c09b8f0d33cf34e417a125b976ee0460915148a70e2f9f2a2989fb0fe571f"

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
