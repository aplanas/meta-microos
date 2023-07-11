SUMMARY = "Safely login with ProtonVPN credentials to connect to Proton"
DESCRIPTION = "This package, originally forked from python-srp module implements a simple \
wrapper to Proton Technologies API, abstracting from the SRP authentication."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python310-proton-client-0.7.1-1.11.noarch.rpm"
RPM_HASH = "4530b0c76f273519f9852c03d4b770516bc72a3b7b7d178438e8bb244656f789052dddeea1482486b61e00685d7d0004123e9c21745fe97091843a39438bd819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-proton-client \
python310-proton-client \
python3dist-proton-client"

RDEPENDS:${PN} += "python-abi \
python310-bcrypt \
python310-gnupg \
python310-pyOpenSSL \
python310-requests"

inherit rpm
