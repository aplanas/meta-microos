SUMMARY = "Legacy data for kbd package"
DESCRIPTION = "The kbd-legacy package contains original keymaps for kbd package. \
Please note that kbd-legacy is not helpful without kbd."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.6.1"

RPM_NAME = "kbd-legacy-2.6.1-1.1.noarch.rpm"
RPM_HASH = "73249bbfe072e41ef7bf2e20c9c4e713f6b1280e474377547df87f3680fbb5b3002620bdc1f6d8520da71e1b9fc6a4f41ab67bf19476235347ffb186e8efba26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbd-legacy"

RDEPENDS:${PN} += ""

inherit rpm
