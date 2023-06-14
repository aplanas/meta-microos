SUMMARY = "Berkeley Logo interpreter"
DESCRIPTION = "Berkeley Logo interpreter is a free (both senses) interpreter for the Logo \
programming language."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.4"

RPM_NAME = "ucblogo-6.2.4-1.2.aarch64.rpm"
RPM_HASH = "3de633b646ee05d99d01d4c85f721ff43f1b45758cb3fde85a1008a5f40d1f71c557ad5dd503c35ac26610d7b48a657a308aeb5e31fd3e61df9e52e0fa5a1909"

RPROVIDES:${PN} += "ucblogo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0"

inherit rpm
