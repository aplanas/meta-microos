SUMMARY = "xSGE Particles"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides particle effects for SGE."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "python310-xsge_particle-1.0-1.8.noarch.rpm"
RPM_HASH = "68d6f1ea9acb880f3e92ca789d76e05dd483c6073d129a871fdc82f273d1a7525391af519e8ee0551a7e33b13e6bd0455b3fa828793e60256921ef419c1edb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xsge-particle \
python310-xsge-particle \
python3dist-xsge-particle"

RDEPENDS:${PN} += "python-abi \
python310-sge-pygame \
python310-six"

inherit rpm
