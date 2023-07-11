SUMMARY = "The successor to the Python testing framework nose, based on unittest"
DESCRIPTION = "nose2 is the successor to nose. It's unittest with plugins. \
nose2 is a new project and does not support all of the behaviors of nose. \
nose2's purpose is to extend unittest to make testing nicer and easier to understand."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.0"

RPM_NAME = "python39-nose2-0.12.0-2.3.noarch.rpm"
RPM_HASH = "ede6e7e87702982f7fca6ad87954cb8e85f69bfdc27850f49cc754e548899bb3aceb73e3f8dddeefea0cb4bca661a10869bca2ed0e598aa5fb4e20116c8532ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nose2 \
python39-nose2 \
python3dist-nose2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
