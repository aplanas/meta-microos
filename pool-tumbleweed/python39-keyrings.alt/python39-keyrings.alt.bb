SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-keyrings.alt-4.2.0-1.3.noarch.rpm"
RPM_HASH = "27cbe7af08aa2ae44e9909285e94a10750088b314a4b6e3aaf7648a0c1345db088add4d997ebb715a7fa5becd567ad2f822fee829e628e7860e580ea48024b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-keyrings.alt \
python39-keyrings.alt \
python3dist-keyrings.alt"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.classes \
python39-pycryptodomex"

inherit rpm
