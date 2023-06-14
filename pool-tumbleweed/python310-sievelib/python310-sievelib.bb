SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-sievelib-1.2.1-1.13.noarch.rpm"
RPM_HASH = "2aacf99e07d6fd5ffd8d395f31ae699678845ceaae4c9c91990b4e944ec70503ffcc6fcd69ca1bbf0dc78626bb51d007bf734220599489da60e215c6a3933e90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sievelib \
python3.10dist-sievelib \
python310-sievelib \
python3dist-sievelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
