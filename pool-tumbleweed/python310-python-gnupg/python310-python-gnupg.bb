SUMMARY = "A wrapper for the GNU Privacy Guard (GPG or GnuPG)"
DESCRIPTION = "This module allows access to GnuPG's key management, \
encryption and signature functionality from Python programs."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-python-gnupg-0.5.0-2.3.noarch.rpm"
RPM_HASH = "1a4358716546d5d69ae175601596ae7b164883c4de0de3ae82d8c1e1814cac324c743b05510b50db60c270db8c6784f350943913a9cfb9ce56be54b0fe3d7fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-gnupg \
python310-gnupg \
python310-python-gnupg \
python3dist-python-gnupg"

RDEPENDS:${PN} += "gpg2 \
python-abi"

inherit rpm
