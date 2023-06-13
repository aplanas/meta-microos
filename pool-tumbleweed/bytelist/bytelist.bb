SUMMARY = "A java library for lists of bytes"
DESCRIPTION = "A small java library for manipulating lists of bytes."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.15"

RPM_NAME = "bytelist-1.0.15-1.8.noarch.rpm"
RPM_HASH = "f0f48159eb21058ed112f970248cac6a5259696a20aadf6215b49132445380a9d10fe3f9a4ad0e1afec5ac229c6efbcd059dd12f0a427fbc97117121c3c236f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bytelist"

RDEPENDS:${PN} += "java \
javapackages-tools \
jcodings"

inherit rpm
