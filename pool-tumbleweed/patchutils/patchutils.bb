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

RPM_NAME = "patchutils-0.4.2-1.11.aarch64.rpm"
RPM_HASH = "125461e90948578bbc0b358abb79da449b9030213fb75e58b6c22ccfb39e49f159372322d3f4ff6c1e450c2c55e42150052fcf6d30ee058f43530f4fac383b16"

RPROVIDES:${PN} += "patchutils \
patchutils(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
diffutils \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
patch"

inherit rpm
