SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-keyrings.alt-4.2.0-1.1.noarch.rpm"
RPM_HASH = "39ce2fa8c5147122ae6d974751f4cfbb06e168e165a4ef16f6eb2fca3eced894b087f7671973de66cd5aae59e50f1de8191585d5bd733023ea7ac835e65c299b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyrings.alt \
python3.10dist(keyrings.alt) \
python310-keyrings.alt \
python3dist(keyrings.alt)"

RDEPENDS:${PN} += "python(abi) \
python310-jaraco.classes \
python310-pycryptodomex"

inherit rpm
