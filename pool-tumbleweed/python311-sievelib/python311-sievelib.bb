SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-sievelib-1.2.1-1.13.noarch.rpm"
RPM_HASH = "c6e0aa8c30c9570b9031d5280c690faeb136a02ed7c905ed2aa21c1cb8bef52696b24f9c58f69fc0f0e98f047835833555b0b3b541cb08eec2f1be08c6dfbd8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sievelib) \
python311-sievelib \
python3dist(sievelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
