SUMMARY = "Data files required by all builds of MAME"
DESCRIPTION = "This package contains all data files needed by the MAME binaries: \
 * shaders \
 * artwork \
 * rom hashes \
 * languages"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.254"

RPM_NAME = "mame-data-0.254-1.1.noarch.rpm"
RPM_HASH = "efb595c6ec953275f7d5a3a5b96ab8c4fc63436f0e01145bc06938a65992334ace52b2cb75476375f6cf68300b5c2eaca40e017d5e1964777dbeea6ea5faf3c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mame-data"

RDEPENDS:${PN} += ""

inherit rpm
