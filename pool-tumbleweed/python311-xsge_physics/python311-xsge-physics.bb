SUMMARY = "xSGE Physics Framework"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a framework for collision physics. \
This can be useful for platformers."
LICENSE = "GPL-3.0-or-later"

PV = "0.13.2"

RPM_NAME = "python311-xsge_physics-0.13.2-1.8.noarch.rpm"
RPM_HASH = "ef87052d4536c9034bc4b061f738758872138bac80a24a9a5c90e9b989af4e7f8d6da1f4c4f52d86f9f1e559ffc82bfd2cc06c62eae2695045406693da3ecb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-physics \
python3.11dist-xsge-physics \
python311-xsge-physics \
python3dist-xsge-physics"

RDEPENDS:${PN} += "python-abi \
python311-sge-pygame"

inherit rpm
