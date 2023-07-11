SUMMARY = "xSGE Physics Framework"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a framework for collision physics. \
This can be useful for platformers."
LICENSE = "GPL-3.0-or-later"

PV = "0.13.2"

RPM_NAME = "python310-xsge_physics-0.13.2-1.8.noarch.rpm"
RPM_HASH = "03d216e3f1f26fcc314661c32b817768af09fb8fe0f543076372e49e74e209ffc57577900652908ad6b67871a9348b52929360d953f28a96f410538da62ab652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xsge-physics \
python310-xsge-physics \
python3dist-xsge-physics"

RDEPENDS:${PN} += "python-abi \
python310-sge-pygame"

inherit rpm
