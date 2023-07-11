SUMMARY = "Design of experiments for Python"
DESCRIPTION = "The pyDOE2 package is a fork of the pyDOE package that is designed to \
help the scientist, engineer, statistician, etc., to construct \
appropriate experimental designs. \
 \
This fork came to life to solve bugs and issues that remained unsolved in the \
original package."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python311-pyDOE2-1.3.0-2.11.noarch.rpm"
RPM_HASH = "46a481d9f6633a79742bf88986fe3f671d966bc47d1c548ac914d10bcfeba61c3d5367b000be31b2c539829f1905ed47a9f2ea36812ce66a154fd9b14356bf47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyDOE2 \
python3.11dist-pydoe2 \
python311-pyDOE2 \
python3dist-pydoe2"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-scipy"

inherit rpm
