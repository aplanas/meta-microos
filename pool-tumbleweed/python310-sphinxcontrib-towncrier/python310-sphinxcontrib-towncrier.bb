SUMMARY = "An RST directive for injecting a Towncrier-generated changelog draft"
DESCRIPTION = "An RST directive for injecting a Towncrier-generated changelog draft containing fragments for the unreleased (next) project version"
LICENSE = "BSD-3-Clause"

PV = "0.3.2a0"

RPM_NAME = "python310-sphinxcontrib-towncrier-0.3.2a0-1.2.noarch.rpm"
RPM_HASH = "eaa1f6073e009d6da624a1f9bee9044e195d911f6a47f4e4b37beafec13ec096408cc3bfcdf77d7c26d9a99af7629dc0a650eccf4881cb8227bc0444c1e0db03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-towncrier \
python310-sphinxcontrib-towncrier \
python3dist-sphinxcontrib-towncrier"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-towncrier"

inherit rpm
