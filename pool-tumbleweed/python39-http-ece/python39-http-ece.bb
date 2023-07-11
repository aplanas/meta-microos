SUMMARY = "Encrypted Content Encoding for HTTP"
DESCRIPTION = "Encrypted Content Encoding for HTTP."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-http-ece-1.1.0-4.4.noarch.rpm"
RPM_HASH = "537efcd8b9ae4ada62cddc7c770228bf87cbf0ba6f4f5faecc2f38ebfc955f52882caa754260abb8546d6539d4002242fd822fd1376e7b3e8519a5c015082cd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-http-ece \
python39-http-ece \
python3dist-http-ece"

RDEPENDS:${PN} += "python-abi \
python39-cryptography"

inherit rpm
