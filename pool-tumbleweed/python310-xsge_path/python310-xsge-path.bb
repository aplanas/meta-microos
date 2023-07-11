SUMMARY = "xSGE Path"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides paths for the SGE.  Paths are used to make \
objects move in a certain way."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-xsge_path-1.0.2-1.8.noarch.rpm"
RPM_HASH = "f3212fe52b953172cfb4ae6677b701eaff2ac62c660df18449bad9640911c77377111d0c25307cf6f3c1c0326bb9e69343327029f8bf91f17d49fc2d50a13a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xsge-path \
python310-xsge-path \
python3dist-xsge-path"

RDEPENDS:${PN} += "python-abi \
python310-sge-pygame"

inherit rpm
