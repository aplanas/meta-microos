SUMMARY = "Documentation for the Parma Polyhedra Library"
DESCRIPTION = "This package contains all the documentations required by programmers \
using the Parma Polyhedra Library (PPL). Install this package if you \
want to program with the PPL."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-doc-1.2-3.1.noarch.rpm"
RPM_HASH = "3f0f4cdb6639dca2bb5cdafca61481bc212be0bec76bc221acbd3bfb08c7b888a65cbbba46dbc64928fd1a0f91a86f76a040083a6cf50cbcb1993ada6acda7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ppl-doc"
RDEPENDS:${PN} += ""

inherit rpm
