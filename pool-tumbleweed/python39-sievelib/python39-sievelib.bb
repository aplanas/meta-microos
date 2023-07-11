SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-sievelib-1.2.1-1.15.noarch.rpm"
RPM_HASH = "fd77d8ca90e41e89d69662e9002318ed50f1d4dbdfbc893385eb9fffed103c7dc4378d3fd358b0330cd21660aab9a5fd4e752bb6fec321cdb093ee0d3919b073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sievelib \
python39-sievelib \
python3dist-sievelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
