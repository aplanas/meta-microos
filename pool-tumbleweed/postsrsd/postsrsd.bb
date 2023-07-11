SUMMARY = "Sender Rewriting Support for postfix"
DESCRIPTION = "PostSRSd provides the Sender Rewriting Scheme (SRS) via TCP-based \
lookup tables for Postfix. SRS is needed if your mail server acts \
as forwarder."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "postsrsd-2.0.5-1.1.aarch64.rpm"
RPM_HASH = "45d9e8507bbefbca9ee9e20c642e8a62124b3e0db88d0a92df174cb52bb33bd1fb219f7634d74c1fd4cb8826545ec7e22dfda8b8d71f9c1b29a34649d74de9d9"

RPROVIDES:${PN} += "group-postsrsd \
postsrsd \
user-postsrsd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libsqlite3.so.0"

inherit rpm
