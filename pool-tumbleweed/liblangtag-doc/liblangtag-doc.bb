SUMMARY = "Documentation of liblangtag API"
DESCRIPTION = "The liblangtag-doc package contains documentation files for liblangtag."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.6.3"

RPM_NAME = "liblangtag-doc-0.6.3-2.7.noarch.rpm"
RPM_HASH = "a7e4a2a7d187f2d14e197d49abb537e090f1056fa6b4f7942febe9768281fd7efbb85acf382482fde0768475cdcc0f686e7033416702a44f3145b7743c5ac96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblangtag-doc"

RDEPENDS:${PN} += ""

inherit rpm
