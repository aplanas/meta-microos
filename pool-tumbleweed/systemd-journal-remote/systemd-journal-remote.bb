SUMMARY = "Gateway for serving journal events over the network using HTTP"
DESCRIPTION = "This extends the journal functionality to keep a copy of logs on a \
remote server by providing programs to forward journal entries over \
the network, using encrypted HTTP, and to write journal files from \
serialized journal contents. \
 \
This package contains systemd-journal-gatewayd, \
systemd-journal-remote, and systemd-journal-upload."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-journal-remote-253.4-2.1.aarch64.rpm"
RPM_HASH = "2517778d20e3a0da9672213664f4be0d6c290f26a9b3412c1a0a311c12276e28c715ca537b43eb2696b745130820568bff9dfee5fae8e22d95addf72116cf6eb"

RPROVIDES:${PN} += "config(systemd-journal-remote) \
systemd-journal-remote \
systemd-journal-remote(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libmicrohttpd.so.12()(64bit) \
libsystemd-shared-253.so()(64bit) \
libsystemd-shared-253.so(SD_SHARED)(64bit) \
systemd"

inherit rpm