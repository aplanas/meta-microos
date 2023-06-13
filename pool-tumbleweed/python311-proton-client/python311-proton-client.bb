SUMMARY = "Safely login with ProtonVPN credentials to connect to Proton"
DESCRIPTION = "This package, originally forked from python-srp module implements a simple \
wrapper to Proton Technologies API, abstracting from the SRP authentication."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python311-proton-client-0.7.1-1.9.noarch.rpm"
RPM_HASH = "18e079ec3462f24280f820b6dde54c2a4cfdc8a95acfe1a6791afa6e2b1e442788fc1b8870dd4df25ca19fd2685fde470e1dc6cc85a8f6082cc53545ce8865d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(proton-client) \
python311-proton-client \
python3dist(proton-client)"

RDEPENDS:${PN} += "python(abi) \
python311-bcrypt \
python311-gnupg \
python311-pyOpenSSL \
python311-requests"

inherit rpm
