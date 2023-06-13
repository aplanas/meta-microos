SUMMARY = "xSGE Lighting Library"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides an interface for lighting."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-xsge_lighting-1.0.2-1.7.noarch.rpm"
RPM_HASH = "1f2995a1140de77606762ea8fcc4f230804fa825fa5ea7df372fd1d656ea9ace58242cfc087b49cc4290c956daa82fe91b3d96fd43357d977d5c18db634c136e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xsge-lighting) \
python311-xsge_lighting \
python3dist(xsge-lighting)"

RDEPENDS:${PN} += "python(abi) \
python311-sge-pygame \
python311-six"

inherit rpm
