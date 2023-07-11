SUMMARY = "Client library for interacting with Gerrit code review"
DESCRIPTION = "Client library for interacting with Gerrit code review rest api \
 \
Pygerrit2 provides a simple interface for clients to interact with \
Gerrit code review via its rest api. \
 \
See also: https://gerritcodereview.com/"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python39-pygerrit2-2.0.15-1.8.noarch.rpm"
RPM_HASH = "4de4f7f204991d276665921501ea360a6114de8bd12eddad38174f8f0637a6a5e37a613370ee5076f1828c81bcf93b9a949847144d907245ab4aeabd74eaea70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygerrit2 \
python39-pygerrit2 \
python3dist-pygerrit2"

RDEPENDS:${PN} += "python-abi \
python39-pbr \
python39-requests"

inherit rpm
