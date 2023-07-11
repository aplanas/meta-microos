SUMMARY = "CLI tool to render text-mode art files as PNG files"
DESCRIPTION = "Ansilove-Term is a command line tool to render text-mode art files as \
PNG files, as well as displaying in several different mediums."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git.20190908"

RPM_NAME = "ansilove-term-0.0.0+git.20190908-2.2.aarch64.rpm"
RPM_HASH = "c14c056edf87c307942407bcf66bcee18918b8b141a0e839d2aac03763fefa8338317824d6a532bbee9d4925fb8e688dd831c20d112c29f0c0e47190047abda1"

RPROVIDES:${PN} += "ansilove-term"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
