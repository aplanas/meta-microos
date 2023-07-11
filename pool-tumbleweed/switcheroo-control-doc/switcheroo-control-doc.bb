SUMMARY = "Documentation for switcheroo-control"
DESCRIPTION = "This package contains the documentation for switcheroo-control."
LICENSE = "GPL-3.0-only"

PV = "2.6"

RPM_NAME = "switcheroo-control-doc-2.6-1.5.noarch.rpm"
RPM_HASH = "f7a2f4837a8b23805d2b04f2c0176a4ea4c5d1de2172275c2f0d43712cba8c2b97611cd6b603ade152565fa5deeeaa011323b7faab5f72bf6de65e136f3ce279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "switcheroo-control-doc"

RDEPENDS:${PN} += ""

inherit rpm
