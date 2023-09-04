SUMMARY = "QMPlay2 development files"
DESCRIPTION = "It's a development package for QMPlay2."
LICENSE = "LGPL-3.0-or-later"

PV = "23.08.22"

RPM_NAME = "QMPlay2-devel-23.08.22-1.1.noarch.rpm"
RPM_HASH = "23a84b888632d4f7436f520d75551d6d8cc48f0721869071a654c02bb0af9163009ab55d60d596c4513f988a015e2dec19208b3868a0fadaa462ee31a10250f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "QMPlay2-devel"

RDEPENDS:${PN} += "QMPlay2"

inherit rpm
