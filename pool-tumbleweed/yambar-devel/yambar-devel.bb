SUMMARY = "Development files for yambar"
DESCRIPTION = "Modules for interacting and modifying yambar."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "yambar-devel-1.10.0-1.1.noarch.rpm"
RPM_HASH = "63c33792f988664f7a9e12035575c3cccc92f02bcb9b35942cd09106a934169f58ab35a49bb7127f5101c04ce37fcd357ba43d25049627a5144712b3cce9c2d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yambar-devel"

RDEPENDS:${PN} += "yambar"

inherit rpm
