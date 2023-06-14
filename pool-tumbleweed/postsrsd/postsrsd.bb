SUMMARY = "Sender Rewriting Support for postfix"
DESCRIPTION = "PostSRSd provides the Sender Rewriting Scheme (SRS) via TCP-based \
lookup tables for Postfix. SRS is needed if your mail server acts \
as forwarder."
LICENSE = "GPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "postsrsd-2.0.4-1.1.aarch64.rpm"
RPM_HASH = "9a4613e7d630892be8b7c2dc0d125f77b64540ca237c87b6dc40d1f7a521f15fd9c093a9aadd0fd78910f985d8dec5261074d114f8be608d1839603b4cc13a92"

RPROVIDES:${PN} += "group-postsrsd \
postsrsd \
user-postsrsd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libsqlite3.so.0"

inherit rpm
