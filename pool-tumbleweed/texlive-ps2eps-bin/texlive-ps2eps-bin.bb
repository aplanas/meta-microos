SUMMARY = "Binary files of ps2eps"
DESCRIPTION = "Binary files of ps2eps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-ps2eps-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "ab740eed50dbd38d936c49f21c5e71b2808b34e0b3055f00f6a3edd2c9e4b8a76c2994854fb86ceacaccf5318eb5f455e6bd6e9b87756e88231c7e188d23dc8b"

RPROVIDES:${PN} += "texlive-ps2eps-bin \
texlive-pstools-bin-/usr/bin/bbox \
texlive-pstools-bin-/usr/bin/ps2eps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-ps2eps"

inherit rpm
