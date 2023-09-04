SUMMARY = "Oracle Cloud Infrastructure CLI"
DESCRIPTION = "The CLI is a small footprint tool that you can use on its own or with the \
Console to complete Oracle Cloud Infrastructure tasks. The CLI provides \
the same core functionality as the Console, plus additional commands. \
Some of these, such as the ability to run scripts, extend the Console's \
functionality."
LICENSE = "Apache-2.0"

PV = "3.30.0"

RPM_NAME = "oci-cli-3.30.0-1.1.noarch.rpm"
RPM_HASH = "78d8f5872f0c3be25e22fb6d25619836be9c4cf1f7510061d777e240061a69bf04e6165f9a2b0417ddb5c11a9d030cacd4ac0686942f53fcd0f2f91ddf90a72d"
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
