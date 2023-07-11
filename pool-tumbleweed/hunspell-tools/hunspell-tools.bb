SUMMARY = "Hunspell tools"
DESCRIPTION = "This package contains the munch and unmunch programs."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "hunspell-tools-1.7.2-1.4.aarch64.rpm"
RPM_HASH = "e7be65392a88483c8d9672d1d870f132db09d8a60b471190862162e9e88f1309189b852f8260ef4bfca3c382a903a1766c104b21601e73c44ac8e43c5f7a5c1b"

RPROVIDES:${PN} += "hunspell-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
hunspell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
