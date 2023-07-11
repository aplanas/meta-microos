SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-sievelib-1.2.1-1.15.noarch.rpm"
RPM_HASH = "7cbcf1b98a25d9afaa6c30177136ba17f8ff3145805dac268f85b6d92f537b1d9d28a6deceb54a921f2cd897379e438ecbd1862cd003d5eee26570ee975193c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sievelib \
python3.11dist-sievelib \
python311-sievelib \
python3dist-sievelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
