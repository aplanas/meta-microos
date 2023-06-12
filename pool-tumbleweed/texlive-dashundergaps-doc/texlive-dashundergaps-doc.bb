SUMMARY = "Documentation for texlive-dashundergaps"
DESCRIPTION = "This package includes the documentation for texlive-dashundergaps"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.0hsvn58150"

RPM_NAME = "texlive-dashundergaps-doc-2023.204.2.0hsvn58150-54.1.noarch.rpm"
RPM_HASH = "1d951b39b60463710a942a8c00d033e9d4a3f29f49e20fdf7e3d4ca606455a5d003042b0f91b1a7b804c9b384ae40e535e08672801e96bedba944016756e8fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashundergaps-doc"
RDEPENDS:${PN} += ""

inherit rpm
