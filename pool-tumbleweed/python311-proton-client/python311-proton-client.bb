SUMMARY = "Safely login with ProtonVPN credentials to connect to Proton"
DESCRIPTION = "This package, originally forked from python-srp module implements a simple \
wrapper to Proton Technologies API, abstracting from the SRP authentication."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python311-proton-client-0.7.1-1.11.noarch.rpm"
RPM_HASH = "eb8f8db1d25ded4a4475edbf2c1c6bb1d8915ae49dcf32f70a76fb184015faf9290590ae666f30075917b1fd599404479ade2f8d4c2220f1f5f0233d89eabc29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proton-client \
python3.11dist-proton-client \
python311-proton-client \
python3dist-proton-client"

RDEPENDS:${PN} += "python-abi \
python311-bcrypt \
python311-gnupg \
python311-pyOpenSSL \
python311-requests"

inherit rpm
