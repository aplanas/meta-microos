SUMMARY = "Sphinx integration with different issuetrackers"
DESCRIPTION = "A Sphinx extension to reference issues in issue trackers, either explicitly \
with an 'issue' role or optionally implicitly by issue ids like ``#10`` in \
plaintext."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "python310-sphinxcontrib-issuetracker-0.11-10.17.noarch.rpm"
RPM_HASH = "febb512e2602e4a335bba0ec57ecbf6a6f7cc34fd0eb9f819b8f7df63e4fdf3da0463cd6d537d399440bd3589dbc32e042d0b8f6a69ea7ffee790646937a1a43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-issuetracker \
python310-sphinxcontrib-issuetracker \
python3dist-sphinxcontrib-issuetracker"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-requests"

inherit rpm
