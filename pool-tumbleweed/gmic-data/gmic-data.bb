SUMMARY = "Shared data files for the various gmic frontends"
DESCRIPTION = "This package contains shared data files for the various gmic frontends."
LICENSE = "CECILL-2.1"

PV = "3.3.0"

RPM_NAME = "gmic-data-3.3.0-1.1.noarch.rpm"
RPM_HASH = "dcd655afc5b1028df8bc3b704035c54da55c48cd5a84eb9c5a2eefe9d94778450fd1530b0d5b05f3f81ffa3313da9c2d00800c3e3eebd30dc214d39ca5c3ca39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-data"

RDEPENDS:${PN} += ""

inherit rpm
