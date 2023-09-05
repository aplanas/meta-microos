SUMMARY = "A powerful duplicate file finder and an enhanced fork of 'fdupes'"
DESCRIPTION = "A program for identifying and taking actions upon duplicate files. \
 \
A WORD OF WARNING: jdupes IS NOT a drop-in compatible replacement for fdupes! \
Do not blindly replace fdupes with jdupes in scripts and expect everything to \
work the same way. Option availability and meanings differ between the two \
programs."
LICENSE = "MIT"

PV = "1.27.3"

RPM_NAME = "jdupes-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "df70cf060fa5273803616c2eb897e1815d8806e277db1b03015aa0217552ca51456035b3867aee88ee64f6d0bdbbd18f2fa1e47d69a0526d8189bc3a6706680b"

RPROVIDES:${PN} += "jdupes \
rpm-macro-fdupes \
rpm-macro-suse-hardlink-dupes \
rpm-macro-suse-symlink-dupes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjodycode.so.3 \
libstdc++.so.6"

inherit rpm
