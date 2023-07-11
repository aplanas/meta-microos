SUMMARY = "Safely login with ProtonVPN credentials to connect to Proton"
DESCRIPTION = "This package, originally forked from python-srp module implements a simple \
wrapper to Proton Technologies API, abstracting from the SRP authentication."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python39-proton-client-0.7.1-1.11.noarch.rpm"
RPM_HASH = "3cfa54828e37a37c34d0d6f8d0019f2977231649713729fb4bf8bbf7b09438dc9e526021ffdee0610523202c647605b872f851f00c873db44133ae5240d15fb6"
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
