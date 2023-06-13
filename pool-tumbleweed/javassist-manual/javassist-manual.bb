SUMMARY = "Tutorial for javassist"
DESCRIPTION = "Tutorial for javassist. \
 \
Tutorial for javassist."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.29.2"

RPM_NAME = "javassist-manual-3.29.2-1.2.noarch.rpm"
RPM_HASH = "c65361649d2e661bb50f39ba18d5539a794e41416059d2453b499264341d8fbaf700985672b525fcccb97ff763124dcae07492157fbd2b24d1ce8564eef5b906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist-manual"

RDEPENDS:${PN} += ""

inherit rpm
