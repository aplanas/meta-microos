SUMMARY = "Traitlets Python configuration system"
DESCRIPTION = "A configuration system for Python applications."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python310-traitlets-5.9.0-2.1.noarch.rpm"
RPM_HASH = "2d7fb71a5ef790db0beb6231e4e02ff78ff618cde3402c9c9fe713e58931d6ffa0047300f3f4fbc1fc02ec7e3274f3daea20ae91a493c1f1a886166ba5e0e4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traitlets \
python3.10dist(traitlets) \
python310-traitlets \
python3dist(traitlets)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
