SUMMARY = "Phabricator API Bindings"
DESCRIPTION = "Phabricator API Bindings"
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python310-phabricator-0.9.1-1.5.noarch.rpm"
RPM_HASH = "678ea6f44f3990e9c8926e5d31d424d9fe0dc8eca72b31c4ee159a3e95d065d4385400123a0f1c18e6ece3decadb0f8a0d52acb4f2688de0e28f1429a9c2260f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-phabricator \
python310-phabricator \
python3dist-phabricator"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
