SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-keyrings.alt-4.2.0-2.1.noarch.rpm"
RPM_HASH = "79dcc9d0741a548d8a7237802b56e36c0d7e67f5096f66a3a01b37654fd92543588a2199b4a5ee5bb99f52a3733738de66d2b38fc20f41bfe0c803490a314082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-keyrings.alt \
python39-keyrings.alt \
python3dist-keyrings.alt"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.classes \
python39-pycryptodomex"

inherit rpm
