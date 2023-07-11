SUMMARY = "A powerful duplicate file finder and an enhanced fork of 'fdupes'"
DESCRIPTION = "A program for identifying and taking actions upon duplicate files. \
 \
A WORD OF WARNING: jdupes IS NOT a drop-in compatible replacement for fdupes! \
Do not blindly replace fdupes with jdupes in scripts and expect everything to \
work the same way. Option availability and meanings differ between the two \
programs."
LICENSE = "MIT"

PV = "1.21.3"

RPM_NAME = "jdupes-1.21.3-1.4.aarch64.rpm"
RPM_HASH = "3a0272a2421b6600d7092aef2e1d669c9106f9240a342b5c1f6d471c6b25fb2e76cfb8be5c9d27e0104ee8f9caa03ed9883b1c11043f60e785c3810b150a750b"

RPROVIDES:${PN} += "jdupes \
rpm-macro-fdupes \
rpm-macro-suse-hardlink-dupes \
rpm-macro-suse-symlink-dupes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
