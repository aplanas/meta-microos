SUMMARY = "An RST directive for injecting a Towncrier-generated changelog draft"
DESCRIPTION = "An RST directive for injecting a Towncrier-generated changelog draft containing fragments for the unreleased (next) project version"
LICENSE = "BSD-3-Clause"

PV = "0.3.2a0"

RPM_NAME = "python310-sphinxcontrib-towncrier-0.3.2a0-1.1.noarch.rpm"
RPM_HASH = "5d8108fda4520b6da9255f22856abaa5ad9b38aa8a86a8449213fa2d0a83222766fe80694032553dba9fab3f2e37101f6b6c557ce092eabcda2762235cdc5147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-towncrier \
python3.10dist(sphinxcontrib-towncrier) \
python310-sphinxcontrib-towncrier \
python3dist(sphinxcontrib-towncrier)"

RDEPENDS:${PN} += "python(abi) \
python310-Sphinx \
python310-towncrier"

inherit rpm
