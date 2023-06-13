SUMMARY = "Vertex Common Theme Files"
DESCRIPTION = "Vertex is a modern theme that comes with three variants to choose \
from. The default variant with dark header-bars, a light variant, \
and a dark variant. It supports MATE, Xfce, and Cinnamon. \
 \
This package contains common files and themes for Marco, Xfwm4, and \
Cinnamon."
LICENSE = "GPL-3.0-or-later"

PV = "20170128"

RPM_NAME = "metatheme-vertex-common-20170128-3.10.noarch.rpm"
RPM_HASH = "e0a268627e9c6aaaac633a828b3db7a8e18a222b473f658d8a7f6a0ec1775554c4d62f43d3f8be981a758c8f93f8edef06e79c22e4a29adf121198b62b658ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-vertex-common"

RDEPENDS:${PN} += ""

inherit rpm
