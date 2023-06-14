SUMMARY = "Read support for remote files for agate"
DESCRIPTION = "Agate-remote adds read support for remote files to agate."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-agate-remote-0.2.1-1.3.noarch.rpm"
RPM_HASH = "c77d7966cd9a877c0f1c3b8857bf77a7891d3379e37c28e77bbe8d88ef3420981b03e924ccdc9cc8ed344e8a4315d6bb0e0f987d9f6efe735a7b693a44cfcebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-agate-remote \
python39-agate-remote \
python3dist-agate-remote"

RDEPENDS:${PN} += "python-abi \
python39-agate \
python39-requests"

inherit rpm
