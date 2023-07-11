SUMMARY = "Architecture-independent data files for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers."
LICENSE = "GPL-3.0-or-later"

PV = "7.16.0"

RPM_NAME = "libmlt7-data-7.16.0-1.2.noarch.rpm"
RPM_HASH = "4485b1f30037005a7e5c23568ca6985e4b2ef0b33644fa68e340bc1ce042138cd6dcec0f3dc82f7b6e5a3ebee0018203c4b5b489a8ae1c9c344676e199bb7c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmlt7-data"

RDEPENDS:${PN} += ""

inherit rpm
