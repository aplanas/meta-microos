SUMMARY = "Safely login with ProtonVPN credentials to connect to Proton"
DESCRIPTION = "This package, originally forked from python-srp module implements a simple \
wrapper to Proton Technologies API, abstracting from the SRP authentication."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python39-proton-client-0.7.1-1.9.noarch.rpm"
RPM_HASH = "f348c5c4007a5355cfa431ae7637d95f9ab0072c30417955a99cdc2074e5d67a19f5727ad1cb3a2455d239f6102c2de9ac2de3dd88979d99f1edde918d6de0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-proton-client \
python39-proton-client \
python3dist-proton-client"

RDEPENDS:${PN} += "python-abi \
python39-bcrypt \
python39-gnupg \
python39-pyOpenSSL \
python39-requests"

inherit rpm
