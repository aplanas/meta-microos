SUMMARY = "Sphinx integration with different issuetrackers"
DESCRIPTION = "A Sphinx extension to reference issues in issue trackers, either explicitly \
with an 'issue' role or optionally implicitly by issue ids like ``#10`` in \
plaintext."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "python311-sphinxcontrib-issuetracker-0.11-10.17.noarch.rpm"
RPM_HASH = "905d8cf9ca60bc0ff88f22ff009014aca6d5edbe2f2690e201007b973308c4c99c84d83b1d7ef08f4bdf02e6be47b263dff6683a125637012245c674f7e43450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-issuetracker \
python3.11dist-sphinxcontrib-issuetracker \
python311-sphinxcontrib-issuetracker \
python3dist-sphinxcontrib-issuetracker"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-requests"

inherit rpm
