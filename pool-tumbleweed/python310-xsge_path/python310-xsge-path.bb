SUMMARY = "xSGE Path"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides paths for the SGE.  Paths are used to make \
objects move in a certain way."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-xsge_path-1.0.2-1.7.noarch.rpm"
RPM_HASH = "114a6fa3f8bdc43ca99427b200ace250a31af3d1d1d43836e8326c3697428d8f2e52a91d31814fd70e854bddf028ad4d710db237ec4f7d1675d8637d4aa51c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge_path \
python3.10dist(xsge-path) \
python310-xsge_path \
python3dist(xsge-path)"
RDEPENDS:${PN} += "python(abi) \
python310-sge-pygame"

inherit rpm
