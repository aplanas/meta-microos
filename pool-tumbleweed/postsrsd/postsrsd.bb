SUMMARY = "Sender Rewriting Support for postfix"
DESCRIPTION = "PostSRSd provides the Sender Rewriting Scheme (SRS) via TCP-based \
lookup tables for Postfix. SRS is needed if your mail server acts \
as forwarder."
LICENSE = "GPL-2.0-only"

PV = "2.0.6"

RPM_NAME = "postsrsd-2.0.6-1.1.aarch64.rpm"
RPM_HASH = "ecee85677226a1e99b6bb82dbacd50b4a32255819d73ea0249bbe59e997ac9b1aff7d1dfb51466f7062f042a5f4671d7c5a65e5d7060eb3a39ced854ee0fa7e6"

RPROVIDES:${PN} += "group-postsrsd \
postsrsd \
user-postsrsd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libsqlite3.so.0"

inherit rpm
