SUMMARY = "Architecture-independent data files for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "libmlt7-data-7.14.0-2.2.noarch.rpm"
RPM_HASH = "75f9a1bb47b827da12a828f668c4b6059f21152937945fe5f9421108701ca2825dac5291bbb9fccc5c906374e5acdd7d4f7485f65b1da127971a794d2c23eb43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmlt7-data"
RDEPENDS:${PN} += ""

inherit rpm
