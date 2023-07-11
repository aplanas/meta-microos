SUMMARY = "A Chess Program"
DESCRIPTION = "A smart chess playing program which uses opening book. \
 \
 \
 \
Authors: \
-------- \
    Dusan Dobes <dobes@math.muni.cz>"
LICENSE = "GPL-2.0+"

PV = "25"

RPM_NAME = "phalanx-25-1.26.aarch64.rpm"
RPM_HASH = "47820d839bc02300b6a67ea3112fbd4bf1acd307b99bc2dfa23e196685688a29ddc9aafe5b0d1bef8850c177293230d3fc60a2f065e81426587621de44cb0fdc"

RPROVIDES:${PN} += "chess-backend \
phalanx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
