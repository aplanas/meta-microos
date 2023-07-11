SUMMARY = "xSGE Physics Framework"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a framework for collision physics. \
This can be useful for platformers."
LICENSE = "GPL-3.0-or-later"

PV = "0.13.2"

RPM_NAME = "python39-xsge_physics-0.13.2-1.8.noarch.rpm"
RPM_HASH = "3aab8eadcc7829ebc81e93aee4dc719543a6e2c820bdfc38ab5b95a0ebc44b7baf25f46f1f360cc1cb37f7496ebfe4768659a71dd68cc30d6a66e12d198a32f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xsge-physics \
python39-xsge-physics \
python3dist-xsge-physics"

RDEPENDS:${PN} += "python-abi \
python39-sge-pygame"

inherit rpm
