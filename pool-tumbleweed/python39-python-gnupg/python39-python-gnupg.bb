SUMMARY = "A wrapper for the GNU Privacy Guard (GPG or GnuPG)"
DESCRIPTION = "This module allows access to GnuPG's key management, \
encryption and signature functionality from Python programs."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-python-gnupg-0.5.0-2.3.noarch.rpm"
RPM_HASH = "81b9b1263cb553f30ca515f98f8a05e172eab8308931deed1e43704a3182b2eba713c99cc42ee6017a4bf429004a7e0884032b20a241ae50faf0cd7a95fefada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-gnupg \
python39-gnupg \
python39-python-gnupg \
python3dist-python-gnupg"

RDEPENDS:${PN} += "gpg2 \
python-abi"

inherit rpm
