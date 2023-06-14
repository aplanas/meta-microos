SUMMARY = "Encrypted Content Encoding for HTTP"
DESCRIPTION = "Encrypted Content Encoding for HTTP."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-http-ece-1.1.0-4.2.noarch.rpm"
RPM_HASH = "1b2d2332eb0826daffda40e5f4eb1fe76b77ad6297b1ced9ad3a77b64f775567ad137cf6556ba809b7773e973a354f5758a3e7be0143948a1c61b20403f01f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-http-ece \
python3.10dist-http-ece \
python310-http-ece \
python3dist-http-ece"

RDEPENDS:${PN} += "python-abi \
python310-cryptography"

inherit rpm
