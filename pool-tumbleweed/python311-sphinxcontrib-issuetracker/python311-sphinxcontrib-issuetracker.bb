SUMMARY = "Sphinx integration with different issuetrackers"
DESCRIPTION = "A Sphinx extension to reference issues in issue trackers, either explicitly \
with an 'issue' role or optionally implicitly by issue ids like ``#10`` in \
plaintext."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "python311-sphinxcontrib-issuetracker-0.11-10.15.noarch.rpm"
RPM_HASH = "3aad42ff70d9468b76f162f80d35be1d61a87205396800883c346366a0d911605df73b5ce5f42670e5b55537c2b59da430b6e6b2f71d71d2330249231fd3f0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-issuetracker) \
python311-sphinxcontrib-issuetracker \
python3dist(sphinxcontrib-issuetracker)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx \
python311-requests"

inherit rpm
