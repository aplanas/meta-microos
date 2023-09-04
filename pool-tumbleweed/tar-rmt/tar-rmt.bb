SUMMARY = "Remote tape drive control server by GNU"
DESCRIPTION = "Provides remote access to files and devices for tar, cpio \
and similar backup utilities"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-rmt-1.34-12.1.aarch64.rpm"
RPM_HASH = "205b88471c5a9d057b22d0db174cf465673753034fc18cc739e8db12d5ecffa8ef86638afa3ef5f840f6374404c52b427834deb0139fd8187a40a3f17809d10b"

RPROVIDES:${PN} += "rmt \
tar-rmt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
