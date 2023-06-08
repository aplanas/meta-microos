SUMMARY = "Common files for the Cinnamon configuration utilities"
DESCRIPTION = "This package contains common files (icons, pixmaps, locales files) \
needed by the configuration applets in the cinnamon-control-center \
package."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "5.6.1"

RPM_NAME = "cinnamon-control-center-common-5.6.1-1.3.noarch.rpm"
RPM_HASH = "20be91033ef6fb4d6f71a2e3067b32c36f1e75bb3e6ecb53e374d5537dbc7e0a00c9f0fda42491722157957ab813200f90facbf9cc69cea101507ee4508364d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-control-center-common"
RDEPENDS:${PN} += ""

inherit rpm
