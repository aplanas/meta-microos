SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-sievelib-1.2.1-2.1.noarch.rpm"
RPM_HASH = "3b6d26f0049c89c1021813b10bd4a5d224567aa66102af63d7e60153cff118b292340b15b4c129c1238aee5df63bfa14b4e40448a03380e1e5b6a6e9ae0f459e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sievelib \
python3.11dist-sievelib \
python311-sievelib \
python3dist-sievelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
