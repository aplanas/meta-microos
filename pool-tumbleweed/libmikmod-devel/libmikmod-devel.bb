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

RPM_NAME = "libmikmod-devel-3.3.11.1-1.15.aarch64.rpm"
RPM_HASH = "ab7848d20ae17ef634ed742a05af7cc0693c60f28971116d0c582ee131c8943525aa0e1ad7d6f39aa6ac4f0aeacd59c3d5bf141fc0aaa4bb538379011e6a49ba"

RPROVIDES:${PN} += "libmikmod-devel \
pkgconfig-libmikmod"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
libmikmod3"

inherit rpm
