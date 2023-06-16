SUMMARY = "The successor to the Python testing framework nose, based on unittest"
DESCRIPTION = "nose2 is the successor to nose. It's unittest with plugins. \
nose2 is a new project and does not support all of the behaviors of nose. \
nose2's purpose is to extend unittest to make testing nicer and easier to understand."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.0"

RPM_NAME = "python39-nose2-0.12.0-2.1.noarch.rpm"
RPM_HASH = "bedeb142bfbc21be929c012a7085067d78733ca69cd48f424d15e5b8cc8b71c592e6cfeaca0e7c4c4cebc65b61a4618b14019f0a56562d54d8c7a517b35fa07a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nose2 \
python39-nose2 \
python3dist-nose2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
