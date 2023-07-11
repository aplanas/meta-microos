SUMMARY = "A Collection of Tools for Manipulating Patch Files"
DESCRIPTION = "Patchutils contains a collection of tools for manipulating patch files: \
interdiff, combinediff, filterdiff, fixcvsdiff, rediff, lsdiff, and \
splitdiff. You can use interdiff to create an incremental patch between \
two patches that are against a common source tree. Combinediff can be \
used for creating a cumulative diff from two incremental patches. \
Filterdiff is for extracting or excluding patches from a patch set \
based on modified files matching shell wildcards. Lsdiff lists modified \
files in a patch. Rediff corrects hand-edited patches."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2"

RPM_NAME = "patchutils-0.4.2-1.12.aarch64.rpm"
RPM_HASH = "54fa340e7685f8313c967c186b03336229055185c1d4d654c5f1cf40e2af76c2dcea2c83173a2786f1eeffaa5171ea4d62c2f679d8112ae16f6e06e9660007cb"

RPROVIDES:${PN} += "patchutils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
diffutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
patch"

inherit rpm
