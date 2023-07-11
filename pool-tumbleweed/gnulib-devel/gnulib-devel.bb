SUMMARY = "Devel files of gnulib"
DESCRIPTION = "The GNU portability library is a macro system and C declarations and \
definitions for commonly-used API elements and abstracted system behaviors. \
It can be used to improve portability and other functionality in your programs. \
 \
This package contains devel files of gnulib."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "git.20211127.db493d1ce"

RPM_NAME = "gnulib-devel-git.20211127.db493d1ce-2.7.noarch.rpm"
RPM_HASH = "fc214cb7f9c20e6791a4ddd718708a68844515701c81f516b6d67a2ade456b2a172897f856894a509df236a28fa1c3e7faa7741e4cd214b4a0a3d508a37fd902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnulib \
gnulib-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
bison \
coreutils \
diffutils \
gettext-devel \
gperf \
libtool \
make \
patch \
texinfo"

inherit rpm
