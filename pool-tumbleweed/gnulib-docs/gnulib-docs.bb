SUMMARY = "Documentation for gnulib modules"
DESCRIPTION = "The GNU portability library is a macro system and C declarations and \
definitions for commonly-used API elements and abstracted system behaviors. \
It can be used to improve portability and other functionality in your programs. \
 \
This package contains documentation for gnulib."
LICENSE = "GFDL-1.3-only"

PV = "git.20211127.db493d1ce"

RPM_NAME = "gnulib-docs-git.20211127.db493d1ce-2.7.noarch.rpm"
RPM_HASH = "3b90d7b4f12b14af2fc2da81abc082fd9f872d741de541817f1d006973428d9b0f62c01f25f218fde7270094f296266544cdce6406c306507c5fc7aacfc1f52c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnulib-docs"

RDEPENDS:${PN} += "/usr/bin/sh \
gnulib-devel \
info"

inherit rpm
