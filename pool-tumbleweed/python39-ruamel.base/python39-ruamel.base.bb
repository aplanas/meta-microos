SUMMARY = "Shared ruamel routines"
DESCRIPTION = "This is a common package for the 'ruamel' namespace."
LICENSE = "MIT"

PV = "1.0.0+post1"

RPM_NAME = "python39-ruamel.base-1.0.0+post1-2.15.noarch.rpm"
RPM_HASH = "f49b658786d3d089f8256b100faf134c33f3c03290366eaa09ed354ab9d545038fa6256ec6da14b87410319937517789bf6b97f0ce100484cbd7dbbb2026297a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ruamel.base \
python39-ruamel.base \
python3dist-ruamel.base"

RDEPENDS:${PN} += "python-abi"

inherit rpm
