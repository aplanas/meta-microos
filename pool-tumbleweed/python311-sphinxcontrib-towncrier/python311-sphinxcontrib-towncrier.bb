SUMMARY = "An RST directive for injecting a Towncrier-generated changelog draft"
DESCRIPTION = "An RST directive for injecting a Towncrier-generated changelog draft containing fragments for the unreleased (next) project version"
LICENSE = "BSD-3-Clause"

PV = "0.3.2a0"

RPM_NAME = "python311-sphinxcontrib-towncrier-0.3.2a0-1.1.noarch.rpm"
RPM_HASH = "2deb82acee4a164d462f1e6cb55ff2fe6550c82eb183fc6877885eb440b2d66192f08f21e3c978d8167e42e60f5ac42ff03bace0a0fb0bec75af502d93a8e56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinxcontrib-towncrier \
python311-sphinxcontrib-towncrier \
python3dist-sphinxcontrib-towncrier"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-towncrier"

inherit rpm
