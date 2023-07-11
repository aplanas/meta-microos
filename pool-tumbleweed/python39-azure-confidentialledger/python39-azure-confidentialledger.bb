SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-confidentialledger-1.1.0-1.2.noarch.rpm"
RPM_HASH = "58cbbd406ab3345ae377d8cc47dbc5c31fe470caf1cf9f8540e80e103609014f1cf6f2ebdd91e2e92b13a29f63b763cc225066de26bda81cde7c1336d0e0ac49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-confidentialledger \
python39-azure-confidentialledger \
python3dist-azure-confidentialledger"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
