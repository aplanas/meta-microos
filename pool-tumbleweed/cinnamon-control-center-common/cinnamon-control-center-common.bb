SUMMARY = "Common files for the Cinnamon configuration utilities"
DESCRIPTION = "This package contains common files (icons, pixmaps, locales files) \
needed by the configuration applets in the cinnamon-control-center \
package."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "cinnamon-control-center-common-5.8.0-1.1.noarch.rpm"
RPM_HASH = "5ba220ccc3c01f870d9da9bf9b865bdc5f6c105c8cc17446a3313ace5c7cd9c3bdb9df12f122f25c9f8d4c2980fc7b07cd1653af1fcde984ca94c358ce27edd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-control-center-common"

RDEPENDS:${PN} += ""

inherit rpm
