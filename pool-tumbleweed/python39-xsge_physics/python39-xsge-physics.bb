SUMMARY = "xSGE Physics Framework"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a framework for collision physics. \
This can be useful for platformers."
LICENSE = "GPL-3.0-or-later"

PV = "0.13.2"

RPM_NAME = "python39-xsge_physics-0.13.2-1.7.noarch.rpm"
RPM_HASH = "e855effc04117a56f16a85b32c4496aaa06ae31264bc36312c0a5a9ff111cb12b84034cb9c1927ccc49fa8773b1c810fc7a33072b5597e6108e4f200f84d9ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xsge-physics) \
python39-xsge_physics \
python3dist(xsge-physics)"
RDEPENDS:${PN} += "python(abi) \
python39-sge-pygame"

inherit rpm
