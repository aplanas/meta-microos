SUMMARY = "Phabricator API Bindings"
DESCRIPTION = "Phabricator API Bindings"
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python310-phabricator-0.9.1-1.3.noarch.rpm"
RPM_HASH = "6cfe628f5055e6ec60e261c4fdb02a4677a5bfb76926763126210a5b00cd12abe6cb90a55b186d2678e5a770a0450172d261a40238d3091925578dac71168a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phabricator \
python3.10dist(phabricator) \
python310-phabricator \
python3dist(phabricator)"

RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
