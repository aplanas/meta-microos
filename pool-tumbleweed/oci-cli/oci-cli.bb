SUMMARY = "Oracle Cloud Infrastructure CLI"
DESCRIPTION = "The CLI is a small footprint tool that you can use on its own or with the \
Console to complete Oracle Cloud Infrastructure tasks. The CLI provides \
the same core functionality as the Console, plus additional commands. \
Some of these, such as the ability to run scripts, extend the Console's \
functionality."
LICENSE = "Apache-2.0"

PV = "3.29.3"

RPM_NAME = "oci-cli-3.29.3-1.1.noarch.rpm"
RPM_HASH = "1e25993d63e7f8f1b1cff2167592279134d6b7b8e9460c5167ac931d561ba6f5cc0d5a4da48777bc94a07dcd4911f121176de912584d17b2d3f7f74b41433139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oci-cli \
python3.11dist-oci-cli \
python3dist-oci-cli"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-arrow \
python3-certifi \
python3-click \
python3-cryptography \
python3-jmespath \
python3-oci-sdk \
python3-prompt-toolkit \
python3-pyOpenSSL \
python3-python-dateutil \
python3-pytz \
python3-six \
python3-terminaltables"

inherit rpm
