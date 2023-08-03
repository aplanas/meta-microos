SUMMARY = "Weblate Documentation"
DESCRIPTION = "HTML documentation files for the Weblate collaborative web translation tool."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.2"

RPM_NAME = "weblate-doc-4.18.2-1.1.noarch.rpm"
RPM_HASH = "e5feaf965e746098e0801e65de099f9e2a1b37d13ff39ea02c514c5729cb310c582b0b86b7aaac10a65e766f4070528fd6a1710b305ee7cf4ac3dbf7285ea7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weblate-doc"

RDEPENDS:${PN} += ""

inherit rpm
