SUMMARY = "Manual for ant-contrib"
DESCRIPTION = "Documentation for ant-contrib tasks."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-manual-1.0b3-10.5.noarch.rpm"
RPM_HASH = "8f2a96bd8fcea3d33e4d889459d52a9f22c770031b060213ab86673ef54441d7be5118cc7393a0018d238d1c644ac4ad1e1064ea48e6be076accae50fa7776f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib-manual"

RDEPENDS:${PN} += ""

inherit rpm
