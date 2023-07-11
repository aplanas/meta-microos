SUMMARY = "Pass backend for python-keyring"
DESCRIPTION = "python-keyring backend getting data from pass."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-keyring-pass-0.7.1-1.5.noarch.rpm"
RPM_HASH = "8c527dc797eda65e828bb83db7d1f12c02769ecd53bd5b62af4348d63e042553b70fe90f490a278abd4c721539be886cbec6f17b3d062f40c639bf26c5067366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-keyring-pass \
python39-keyring-pass \
python3dist-keyring-pass"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.classes \
python39-keyring"

inherit rpm
