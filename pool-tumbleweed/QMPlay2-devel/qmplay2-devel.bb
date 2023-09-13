SUMMARY = "QMPlay2 development files"
DESCRIPTION = "It's a development package for QMPlay2."
LICENSE = "LGPL-3.0-or-later"

PV = "23.09.05"

RPM_NAME = "QMPlay2-devel-23.09.05-1.1.noarch.rpm"
RPM_HASH = "cd8f607fec35d3290698940aa86e54bee0a931e7a083d9c57baffa0148638d293a89db586700ea5fe69cc2ce40e5348a50df67af080630a26b57534195736093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "QMPlay2-devel"

RDEPENDS:${PN} += "QMPlay2"

inherit rpm
