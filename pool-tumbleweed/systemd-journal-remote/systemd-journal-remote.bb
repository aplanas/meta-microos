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

RPM_NAME = "systemd-journal-remote-253.7-1.2.aarch64.rpm"
RPM_HASH = "b5d95df36c5c634fe41ea7ed884ad46cde0bd9d16f0193904073e5d53ce52a866c1a8f5fe45b04f2927ee98438b005df1ea4ee9b96f73fb9f936fb19acf7de09"

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
