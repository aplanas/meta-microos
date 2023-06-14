SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python310-pyupgrade-3.4.0-1.1.noarch.rpm"
RPM_HASH = "7e532d765259f68db6b7a00e9d9d9429233f8b1b959503a691b6293915bec82131d52b15d0344166672bf90fe67679e6a0f7f3cd5035ecae5708aeaa5de0e389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyupgrade \
python3.10dist-pyupgrade \
python310-pyupgrade \
python3dist-pyupgrade"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-tokenize-rt \
update-alternatives"

inherit rpm
