SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-sievelib-1.2.1-1.15.noarch.rpm"
RPM_HASH = "e796ceda09a049a6dd820397e9bcb1643316b945b7b49396f3bee2cfca68a8614e0b9e65526200fc690730f1f1383e746b77b908aa7d33095c4b74b1b2c670fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sievelib \
python310-sievelib \
python3dist-sievelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
