SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-sievelib-1.2.1-2.1.noarch.rpm"
RPM_HASH = "6a0e2288a2d470a4d8380971853436d8355eb560a0e84474c31d91f8de1f2cbd373a85447cdc4cc2711e1c5c4f65b7b48a3e705263c9342b4f02555e20b77fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sievelib \
python310-sievelib \
python3dist-sievelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
