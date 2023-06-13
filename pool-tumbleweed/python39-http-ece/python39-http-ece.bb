SUMMARY = "Encrypted Content Encoding for HTTP"
DESCRIPTION = "Encrypted Content Encoding for HTTP."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-http-ece-1.1.0-4.2.noarch.rpm"
RPM_HASH = "36401651337a8b90c895037f633792a353a67fc26d72701907db8f9f1c4444a9d0bd94ce6a5c023297282963ee64d2930424252c7ecbb78283c94719f44b0846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(http-ece) \
python39-http-ece \
python3dist(http-ece)"

RDEPENDS:${PN} += "python(abi) \
python39-cryptography"

inherit rpm
