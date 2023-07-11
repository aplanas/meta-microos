SUMMARY = "Oracle Cloud Infrastructure CLI"
DESCRIPTION = "The CLI is a small footprint tool that you can use on its own or with the \
Console to complete Oracle Cloud Infrastructure tasks. The CLI provides \
the same core functionality as the Console, plus additional commands. \
Some of these, such as the ability to run scripts, extend the Console's \
functionality."
LICENSE = "Apache-2.0"

PV = "3.29.2"

RPM_NAME = "oci-cli-3.29.2-1.1.noarch.rpm"
RPM_HASH = "997853567b6d8b3c68b69270f095ba967f6c5b69e5b4056aec01685da32773692dfd8847d1b4dd3fd581fb3a433684fbef5935596b0cebdc34028a8ca754d1ad"
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
