SUMMARY = "The successor to the Python testing framework nose, based on unittest"
DESCRIPTION = "nose2 is the successor to nose. It's unittest with plugins. \
nose2 is a new project and does not support all of the behaviors of nose. \
nose2's purpose is to extend unittest to make testing nicer and easier to understand."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.0"

RPM_NAME = "python310-nose2-0.12.0-2.3.noarch.rpm"
RPM_HASH = "e971be78314af63b69f0c1263cbda2a5e0ef5f250bbc1f2df7a8120d9f5a5ad9752124cd0edf34cbaf76bf9e1ee7caa5899e22956d05472f2a197a79c09e1567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nose2 \
python310-nose2 \
python3dist-nose2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
