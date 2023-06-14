SUMMARY = "xSGE Particles"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides particle effects for SGE."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "python39-xsge_particle-1.0-1.7.noarch.rpm"
RPM_HASH = "e2562ed4ceeccdfaeab1535f6badf0f69b8bc8c1be1858c61721efd1c006e9c9ccefaf9f95b144c6d3e38f2576265f00cc5b9533b6b61078c8c0c12181dc30a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xsge-particle \
python39-xsge-particle \
python3dist-xsge-particle"

RDEPENDS:${PN} += "python-abi \
python39-sge-pygame \
python39-six"

inherit rpm
