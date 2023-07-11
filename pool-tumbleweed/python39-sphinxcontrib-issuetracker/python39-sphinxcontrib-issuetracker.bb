SUMMARY = "Sphinx integration with different issuetrackers"
DESCRIPTION = "A Sphinx extension to reference issues in issue trackers, either explicitly \
with an 'issue' role or optionally implicitly by issue ids like ``#10`` in \
plaintext."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "python39-sphinxcontrib-issuetracker-0.11-10.17.noarch.rpm"
RPM_HASH = "865f05f2a8cdf8c2a01dcec14825a79ad501731a1b64a033ea46274294a77a0d843c936bccd9edd005b300ba02efe53a0c5b124189bd3a298672e8652462072f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-issuetracker \
python39-sphinxcontrib-issuetracker \
python3dist-sphinxcontrib-issuetracker"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-requests"

inherit rpm
