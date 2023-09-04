SUMMARY = "Data files required by all builds of MAME"
DESCRIPTION = "This package contains all data files needed by the MAME binaries: \
 * shaders \
 * artwork \
 * rom hashes \
 * languages"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.257"

RPM_NAME = "mame-data-0.257-1.1.noarch.rpm"
RPM_HASH = "c58c8dc572225de226f2bcfed50dabe871571ce12d09e9979ffb152bcdc17285b79b54a93f723e2bee09a8e62de88694c6232e639a53f5d8fd93058f40c94e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mame-data"

RDEPENDS:${PN} += ""

inherit rpm
