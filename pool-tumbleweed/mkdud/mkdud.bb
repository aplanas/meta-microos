SUMMARY = "Create driver update from rpms"
DESCRIPTION = "Create a driver update from rpms. \
 \
Authors: \
-------- \
    Steffen Winterfeldt"
LICENSE = "GPL-3.0-or-later"

PV = "1.55"

RPM_NAME = "mkdud-1.55-1.3.noarch.rpm"
RPM_HASH = "e4269cbac5f7914bb70777ed952a32ecc4fa67576dde6f3d617518fc3c15c371c91040b25c582aee85d6ed3b329e60cb7392c2be83a89d73395eaf3a5630a07d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mkdud"

RDEPENDS:${PN} += "/usr/bin/perl \
gpg2"

inherit rpm
