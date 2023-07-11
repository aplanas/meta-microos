SUMMARY = "A wrapper for the GNU Privacy Guard (GPG or GnuPG)"
DESCRIPTION = "This module allows access to GnuPG's key management, \
encryption and signature functionality from Python programs."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-python-gnupg-0.5.0-2.3.noarch.rpm"
RPM_HASH = "ab79f72100be4bc4fbf3cbe4cb72d1bf4155ddff196ef7587cdcc71a9399534932d3bc9fae02264794c37b1718a3ca85ff67d22a04b72fef97ffbbf93fb97944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gnupg \
python3-python-gnupg \
python3.11dist-python-gnupg \
python311-gnupg \
python311-python-gnupg \
python3dist-python-gnupg"

RDEPENDS:${PN} += "gpg2 \
python-abi"

inherit rpm
