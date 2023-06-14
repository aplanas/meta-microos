SUMMARY = "xSGE Particles"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides particle effects for SGE."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "python310-xsge_particle-1.0-1.7.noarch.rpm"
RPM_HASH = "34fb188732e2ca96b72a43513ec142a9e98d786fe7cec380c7d750b32b64cabf12beab87c86cc391cbac1fd6cfbb15a4252ec0ee9273fee89007d9e3271217b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-particle \
python3.10dist-xsge-particle \
python310-xsge-particle \
python3dist-xsge-particle"

RDEPENDS:${PN} += "python-abi \
python310-sge-pygame \
python310-six"

inherit rpm
