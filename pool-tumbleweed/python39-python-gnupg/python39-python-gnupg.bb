SUMMARY = "A wrapper for the GNU Privacy Guard (GPG or GnuPG)"
DESCRIPTION = "This module allows access to GnuPG's key management, \
encryption and signature functionality from Python programs."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-python-gnupg-0.5.0-2.1.noarch.rpm"
RPM_HASH = "d3a15eb99c4a0a7c4d3745a25af867c6833e1bc784502aef24ea84deb10158b0d2dcb691d6ece67cdad2900349a6ebecd2a735a3e52d2c7cfe8609dc38d5183b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-gnupg) \
python39-gnupg \
python39-python-gnupg \
python3dist(python-gnupg)"

RDEPENDS:${PN} += "gpg2 \
python(abi)"

inherit rpm
