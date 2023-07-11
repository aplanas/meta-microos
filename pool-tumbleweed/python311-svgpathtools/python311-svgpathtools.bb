SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python311-svgpathtools-1.6.1-1.3.noarch.rpm"
RPM_HASH = "c55cf5047790178249a9a2e3e52cfff2e1617d4926eb1f59520afa26f1049454bea76513c75ac0f39bc4c47fc08a2efd59233081fc6c6708e0d3e9ae9f2df2d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svgpathtools \
python3.11dist-svgpathtools \
python311-svgpathtools \
python3dist-svgpathtools"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-scipy \
python311-svgwrite"

inherit rpm
