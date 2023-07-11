SUMMARY = "Scalable IRCv3.2 compliant chat daemon"
DESCRIPTION = "Solanum is an IRCv3.2 compatible chat server. It is a continuation of the \
Charybdis server and has good documentation and ease of configuration. \
 \
Charybdis was used on various networks either as itself, or as \
the basis of a customized IRC server implementation. One such \
customization is ircd-seven which powers Freenode, the largest IRC \
network in the world."
LICENSE = "GPL-2.0-or-later"

PV = "0~ch560"

RPM_NAME = "solanum-0~ch560-3.1.aarch64.rpm"
RPM_HASH = "0dcc7d886e06cb2ad08151733084df1b56ea7a3c0a46d62528381dd89b67c7e130429872ce761bc354845c21b8f1a421031639dbefafa6a64d85e800e295b7fd"

RPROVIDES:${PN} += "config-solanum \
libircd.so \
librb.so \
solanum"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libltdl.so.7 \
libsqlite3.so.0 \
libssl.so.3 \
shadow"

inherit rpm
