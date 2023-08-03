SUMMARY = "Scalable IRCv3.2 compliant chat daemon"
DESCRIPTION = "Solanum is an IRCv3.2 compatible chat server. It is a continuation of the \
Charybdis server and has good documentation and ease of configuration. \
It is used by Libera, the largest (as of 2023) IRC network in the world."
LICENSE = "GPL-2.0-or-later"

PV = "0~ch634"

RPM_NAME = "solanum-0~ch634-1.1.aarch64.rpm"
RPM_HASH = "b7a2bdee462d7abbdccdd9d679f163aaf0071a4c6ae84096a206e7cd6821a57f539b9cc902e2ab07e458a7dfe07f66649f6bc94f23e4feaaa97eaef7a5f19665"

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
