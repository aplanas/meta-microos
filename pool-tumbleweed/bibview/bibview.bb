SUMMARY = "X11 Front-End for BibTeX Databases"
DESCRIPTION = "Using bibview, entries in several BiB databases can be moved, \
manipulated, created, and searched."
LICENSE = "SUSE-Permissive"

PV = "2.2"

RPM_NAME = "bibview-2.2-1008.17.aarch64.rpm"
RPM_HASH = "2d4fb124e08f12ee14312f946793e3250201c0a76bfc6d46ab3177e737a13d3188d980a2357a2e4ca6a956940a19d1bc5762ebd2ae57b87728462286cfbe26b1"

RPROVIDES:${PN} += "bibview \
bibvw15 \
config-bibview"

RDEPENDS:${PN} += "libX11.so.6 \
libXaw3d.so.8 \
libXt.so.6 \
libc.so.6"

inherit rpm
