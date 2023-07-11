SUMMARY = "Start with silence, not with noise But do start!"
DESCRIPTION = "Start with silence, not with noise. But do start! \
 \
Pylint-ignore is a wrapper around Pylint that maintains a pylint-ignore.md file. \
This file is used to ignore Pylint messages without adding comments to the \
source code itself. It's similar to Rupocop's .rubocop_todo.yml."
LICENSE = "MIT"

PV = "2022.1025"

RPM_NAME = "python310-pylint-ignore-2022.1025-3.3.noarch.rpm"
RPM_HASH = "ac4780be85cad856dc591b2d6a8f424abd6d95b5ede350858aa09dbd68e1ac4c8cfd58f66f0c3d88a2a814647693fdf9b986cf2c2a964389cc584725ec094dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylint-ignore \
python310-pylint-ignore \
python3dist-pylint-ignore"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-astroid \
python310-pylev \
python310-pylint \
update-alternatives"

inherit rpm
