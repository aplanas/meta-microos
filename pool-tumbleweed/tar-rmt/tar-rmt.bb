SUMMARY = "Remote tape drive control server by GNU"
DESCRIPTION = "Provides remote access to files and devices for tar, cpio \
and similar backup utilities"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-rmt-1.34-11.1.aarch64.rpm"
RPM_HASH = "8e7793f8f258d9be46ce605783c64ccb308bee28518017c755fa765f012d9928b3bc963e9700e272796063e9d0ea77b50c9eaf6030360a01251d9270785a07eb"

RPROVIDES:${PN} += "rmt \
tar-rmt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
