SUMMARY = "YaST2 - Indonesian Translations"
DESCRIPTION = "YaST2 - Indonesian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-id-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "00dbc692a51edf66c6406b6aae83c947d589c39f84917026b9126716b0c9e6169418bad84742eaa5f3d7001526af90be07d36bf6a41a09de4144fab7310c97bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-id \
yast2-trans-id"

RDEPENDS:${PN} += ""

inherit rpm
