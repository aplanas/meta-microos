SUMMARY = "Additional Plasma Wallpapers"
DESCRIPTION = "Additional wallpapers for Plasma Workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-workspace-wallpapers-5.27.7-1.1.noarch.rpm"
RPM_HASH = "cf8c72a78dc80856120afbedbf9ec0634f1aa09ebd2031859bbd7fab67058d3422370bd80b19a01d44e52b85e8b03802a6fd26c7a46b58e367fe80534281804a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-workspace-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
