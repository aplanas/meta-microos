SUMMARY = "Font with Basic Maya Glyphs"
DESCRIPTION = "Maya covers the glyphs in J. Eric S. Thompson’s “A Catalog of Maya \
Hieroglyphs”, as well as some extra glyphs for days, months and numbers. \
This is a work-font that may be of some scholarly use; it is not a proposal \
of any kind. There are no plans to improve or expand it."
LICENSE = "SUSE-Permissive"

PV = "4.17"

RPM_NAME = "gdouros-maya-fonts-4.17-1.16.noarch.rpm"
RPM_HASH = "a4059f4c75406ecde24d353b80f047490c316c78bfb2fbb151cb788e89b38e69eb833d3d46f2d0b588a4f00ae5d1453fb51af865536745860651b74682113020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-maya-fonts \
maya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
