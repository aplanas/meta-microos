SUMMARY = "Helper to build testable command line interfaces"
DESCRIPTION = "CliKit is a group of utilities to build beautiful and testable \
command line interfaces."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-clikit-0.6.2-3.1.noarch.rpm"
RPM_HASH = "7140f2deb5cad93079ade2d257d11fa0b0d44eb8e72a74925d339d45c4e2b10233c06d0fa22b3a9d3eebcfb6665495b9064ba1e1ffff435ea07076b5bdd7613a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-clikit \
python310-clikit \
python3dist-clikit"

RDEPENDS:${PN} += "python-abi \
python310-crashtest \
python310-pastel \
python310-pylev"

inherit rpm
