SUMMARY = "Context Triggered Piecewise Hashing values"
DESCRIPTION = "ssdeep is a program for computing and matching Context Triggered Piecewise \
Hashing values. It is based on a spam detector called spamsum by Andrews \
Trigdell"
LICENSE = "GPL-2.0 & GPL-2.0+"

PV = "2.14.1"

RPM_NAME = "ssdeep-2.14.1-1.24.aarch64.rpm"
RPM_HASH = "7295110c077de2e524e836f00846492b5600684713605b267c4b4ff9ca7ea6965206448f63b6424fcb5074005fb59d0162f6f650426aa375a24e492f74db447e"

RPROVIDES:${PN} += "ssdeep"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuzzy.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
