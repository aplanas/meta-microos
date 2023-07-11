SUMMARY = "An RST directive for injecting a Towncrier-generated changelog draft"
DESCRIPTION = "An RST directive for injecting a Towncrier-generated changelog draft containing fragments for the unreleased (next) project version"
LICENSE = "BSD-3-Clause"

PV = "0.3.2a0"

RPM_NAME = "python39-sphinxcontrib-towncrier-0.3.2a0-1.2.noarch.rpm"
RPM_HASH = "ceeaa054b2e69dbfe80cddfb173b124993a81b0f7acb36eec5333060f0de034bb5a7966b5d2e33e5ec29072f25d11965a9a953db45d68e7a45b6e9cd02e44eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-towncrier \
python39-sphinxcontrib-towncrier \
python3dist-sphinxcontrib-towncrier"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-towncrier"

inherit rpm
