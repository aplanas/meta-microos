SUMMARY = "Oracle Cloud Infrastructure CLI"
DESCRIPTION = "The CLI is a small footprint tool that you can use on its own or with the \
Console to complete Oracle Cloud Infrastructure tasks. The CLI provides \
the same core functionality as the Console, plus additional commands. \
Some of these, such as the ability to run scripts, extend the Console's \
functionality."
LICENSE = "Apache-2.0"

PV = "3.30.2"

RPM_NAME = "oci-cli-3.30.2-1.1.noarch.rpm"
RPM_HASH = "eb6a2cc6b28698568e3a5bd1b44afc00b09435fe228ffc9b2d854365b9bf410d4068b705b549d85bb09127e7eae20ae33fe37944a829306915d8c09ca6039ee6"
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
