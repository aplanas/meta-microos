SUMMARY = "xSGE Physics Framework"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a framework for collision physics. \
This can be useful for platformers."
LICENSE = "GPL-3.0-or-later"

PV = "0.13.2"

RPM_NAME = "python310-xsge_physics-0.13.2-1.7.noarch.rpm"
RPM_HASH = "1eae43263ce6c108e1041e0882ac10cdf454412003d3f2e2027fba720ad14557be64ec1d4991c98492a8ed1996138c3f9e0f380fa30b56ce6e484a4b80f476a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge_physics \
python3.10dist(xsge-physics) \
python310-xsge_physics \
python3dist(xsge-physics)"

RDEPENDS:${PN} += "python(abi) \
python310-sge-pygame"

inherit rpm
