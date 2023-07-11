SUMMARY = "Start with silence, not with noise But do start!"
DESCRIPTION = "Start with silence, not with noise. But do start! \
 \
Pylint-ignore is a wrapper around Pylint that maintains a pylint-ignore.md file. \
This file is used to ignore Pylint messages without adding comments to the \
source code itself. It's similar to Rupocop's .rubocop_todo.yml."
LICENSE = "MIT"

PV = "2022.1025"

RPM_NAME = "python39-pylint-ignore-2022.1025-3.3.noarch.rpm"
RPM_HASH = "f0b59cd9e1b89afe813858065279d623b686e1c86268d23b691213ce97ef2fb8c93e4ff422c541c07fbc93041a2b24888fa7aebeaa9a8ab541fccf76bfbf2a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylint-ignore \
python39-pylint-ignore \
python3dist-pylint-ignore"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-astroid \
python39-pylev \
python39-pylint \
update-alternatives"

inherit rpm
