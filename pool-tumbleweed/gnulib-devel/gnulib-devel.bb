SUMMARY = "Devel files of gnulib"
DESCRIPTION = "The GNU portability library is a macro system and C declarations and \
definitions for commonly-used API elements and abstracted system behaviors. \
It can be used to improve portability and other functionality in your programs. \
 \
This package contains devel files of gnulib."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "git.20211127.db493d1ce"

RPM_NAME = "gnulib-devel-git.20211127.db493d1ce-2.6.noarch.rpm"
RPM_HASH = "b13800af41de87533a79ee59db56e3f1fe4d6b6b1891fd54219d1ab9e1e5e4a9c96ed0798816689ae6d8291a1a90216695c1aef8392f9225eca309c870f89508"
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
