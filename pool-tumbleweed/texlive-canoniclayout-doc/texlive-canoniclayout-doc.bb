SUMMARY = "Documentation for texlive-canoniclayout"
DESCRIPTION = "This package includes the documentation for texlive-canoniclayout"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64889"

RPM_NAME = "texlive-canoniclayout-doc-2023.201.1.0svn64889-52.1.noarch.rpm"
RPM_HASH = "56d696b56eac2fdb6896ca43c34ea966d7fa8fd670bb6467e96b60617f13372e94b382f0f54deb6af14938b8ebd8ce2ef8d4171fce2ddedc2a2bde0b7d361dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-canoniclayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
