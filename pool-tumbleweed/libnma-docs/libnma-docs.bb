SUMMARY = "Documentation files for libnma"
DESCRIPTION = "Documentation files for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-docs-1.10.6-1.4.noarch.rpm"
RPM_HASH = "d604caa1694861b39f2fed847e42b2d832809a68e6a0b716483178cd965d18738615069d78d43d320982fd27062e1740270b7d1b447e9f1fa610bb383a4cf095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnma-docs"

RDEPENDS:${PN} += ""

inherit rpm
