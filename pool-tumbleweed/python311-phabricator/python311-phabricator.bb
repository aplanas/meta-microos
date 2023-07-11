SUMMARY = "Phabricator API Bindings"
DESCRIPTION = "Phabricator API Bindings"
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python311-phabricator-0.9.1-1.5.noarch.rpm"
RPM_HASH = "a2ce355f85027d0c4353c02e5be3c1bda4e2919ea1df0762fc7321af9fd6208ceb92927454092f419b4f25196ac23f9c540b19cd2e7bdc9cd23767fe89359337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phabricator \
python3.11dist-phabricator \
python311-phabricator \
python3dist-phabricator"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
