SUMMARY = "The successor to the Python testing framework nose, based on unittest"
DESCRIPTION = "nose2 is the successor to nose. It's unittest with plugins. \
nose2 is a new project and does not support all of the behaviors of nose. \
nose2's purpose is to extend unittest to make testing nicer and easier to understand."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.0"

RPM_NAME = "python311-nose2-0.12.0-2.3.noarch.rpm"
RPM_HASH = "fe064d25c201290f00ee88a5bb65f4588b31b46a946b4cb269c0200dc9aac1151de884a0af5a328473c5affeac89f4d6d4a97f7345c80ba0a5944b1fed2f22d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nose2 \
python3.11dist-nose2 \
python311-nose2 \
python3dist-nose2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
