SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python39-pyupgrade-3.4.0-1.3.noarch.rpm"
RPM_HASH = "f5a79dc95ec4c18f700dfb5edb63dadc6708b86cdf1fa2d39c26b538be18cbfeb7e6833ca52510f9ce9b89240b426c2e606144ec08c9c2de34470b2458705c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyupgrade \
python39-pyupgrade \
python3dist-pyupgrade"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-tokenize-rt \
update-alternatives"

inherit rpm
