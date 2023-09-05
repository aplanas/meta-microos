SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-sievelib-1.2.1-2.1.noarch.rpm"
RPM_HASH = "c52fbe557d6a94e562abfb21574d738e453ca6e4a7c4de182bb8531d00f01d8735f21aaa48cdabb05e0d9b87cd0ff63ea4ad6847b96b43f06b1389c858f3cabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sievelib \
python39-sievelib \
python3dist-sievelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
