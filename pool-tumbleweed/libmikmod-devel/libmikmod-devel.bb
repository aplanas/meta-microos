SUMMARY = "Development files for MikMod Sound Library"
DESCRIPTION = "This package contains files needed for compiling programs using \
libmikmod. \
 \
Libmikmod is a portable sound library, capable of playing samples as \
well as module files. It was originally written by Jean-Paul Mikkers \
(MikMak) for DOS. It supports OSS /dev/dsp, ALSA, and Esound and can \
also write wav files. Supported file formats include mod, stm, s3m, \
mtm, xm, and it."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.11.1"

RPM_NAME = "libmikmod-devel-3.3.11.1-1.16.aarch64.rpm"
RPM_HASH = "b396fb60ccf368ece9136062ce1e1e73729abf35a582f24948ee80ae0471cd49dff0f4cfd17de013bc6bdf09fc9e4369c7158e0628ccce18274bcf0eb0198702"

RPROVIDES:${PN} += "libmikmod-devel \
pkgconfig-libmikmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libmikmod3"

inherit rpm
