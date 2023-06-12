SUMMARY = "QMPlay2 development files"
DESCRIPTION = "It's a development package for QMPlay2."
LICENSE = "LGPL-3.0-or-later"

PV = "23.06.04"

RPM_NAME = "QMPlay2-devel-23.06.04-1.1.noarch.rpm"
RPM_HASH = "63c179d4df756bf4f2bf6f303c5be77ec60880a04e906f295b123b0fb4c94ffa10c6189c27515e82d836eb0041297d4d35b75aa9333a2926eed02de00261a53d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "QMPlay2-devel"
RDEPENDS:${PN} += "QMPlay2"

inherit rpm
