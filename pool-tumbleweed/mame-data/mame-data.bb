SUMMARY = "Data files required by all builds of MAME"
DESCRIPTION = "This package contains all data files needed by the MAME binaries: \
 * shaders \
 * artwork \
 * rom hashes \
 * languages"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.258"

RPM_NAME = "mame-data-0.258-1.1.noarch.rpm"
RPM_HASH = "2fa208f8db2c65bead573e43aaac4133465ad02505ea6352b80776d448c66f21ac28a2c347a977a641b7228b967ac8cb2247be3ac5211567b9567ceed02219d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mame-data"

RDEPENDS:${PN} += ""

inherit rpm
