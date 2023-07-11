SUMMARY = "xSGE Particles"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides particle effects for SGE."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "python311-xsge_particle-1.0-1.8.noarch.rpm"
RPM_HASH = "d4ced23808269a6e3a1b68aeb3053d769637529c00f89b45a94ebabafba61f10753667a29b245dc69152542f6ee5f5bc75fa51f22320828905c9d512a8d70142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-particle \
python3.11dist-xsge-particle \
python311-xsge-particle \
python3dist-xsge-particle"

RDEPENDS:${PN} += "python-abi \
python311-sge-pygame \
python311-six"

inherit rpm
