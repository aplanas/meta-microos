SUMMARY = "Development files for aircrack-ng"
DESCRIPTION = "Development files for aircrack-ng."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "aircrack-ng-devel-1.7-2.4.noarch.rpm"
RPM_HASH = "194e63255851a4227e5507901108cd7c7388629253243a241cbc6b9e7f32ae2d60ae0be7a2d9b0ded25c7e816448864e1374c64de14f15da8c0f8f07320915e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aircrack-ng-devel"

RDEPENDS:${PN} += "aircrack-ng"

inherit rpm
