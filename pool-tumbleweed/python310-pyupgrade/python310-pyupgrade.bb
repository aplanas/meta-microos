SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python310-pyupgrade-3.4.0-1.3.noarch.rpm"
RPM_HASH = "925e834ccf71c9b0f6b09315caf52067df8d399b794c7e50385e6042c299fe5b0765576f8402c4c8e5965a121d2961e45be56b56e48d96f46b8c587776688ef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyupgrade \
python310-pyupgrade \
python3dist-pyupgrade"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-tokenize-rt \
update-alternatives"

inherit rpm
