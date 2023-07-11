SUMMARY = "A java library for lists of bytes"
DESCRIPTION = "A small java library for manipulating lists of bytes."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.15"

RPM_NAME = "bytelist-1.0.15-1.9.noarch.rpm"
RPM_HASH = "4f9d9524f78ff316146eb37fc327fc164d71043abb27c6027cd8319ef1ba4a4d7cc43752178f21a04389f122490988ba781aa5aa39309d8e3460ba1edbe740eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bytelist"

RDEPENDS:${PN} += "java \
javapackages-tools \
jcodings"

inherit rpm
