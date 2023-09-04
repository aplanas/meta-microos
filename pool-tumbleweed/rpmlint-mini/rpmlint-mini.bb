SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230818.5cdd21d0"

RPM_NAME = "rpmlint-mini-2.4.0+git20230818.5cdd21d0-12.9.aarch64.rpm"
RPM_HASH = "4deedb3ae08271dd3fa2f36d8473ca6a0d28328b4de90e3e9524b3331fb170a91bbb04531b4fa7694e22d5f7aaa8a75718c95140d5a0f7648ca83f173b9bccf5"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
