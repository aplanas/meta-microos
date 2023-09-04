SUMMARY = "Sender Rewriting Support for postfix"
DESCRIPTION = "PostSRSd provides the Sender Rewriting Scheme (SRS) via TCP-based \
lookup tables for Postfix. SRS is needed if your mail server acts \
as forwarder."
LICENSE = "GPL-2.0-only"

PV = "2.0.8"

RPM_NAME = "postsrsd-2.0.8-1.1.aarch64.rpm"
RPM_HASH = "ea9d4f60666440c42cdb45f9866f1992898a89470fc4bcf3b6c657b7582576bbd591952db9e012e37ad63e8c29346923ff489bd8d79009101d04b2bbe7393ece"

RPROVIDES:${PN} += "group-postsrsd \
postsrsd \
user-postsrsd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libsqlite3.so.0"

inherit rpm
