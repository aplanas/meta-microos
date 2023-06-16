SUMMARY = "Start with silence, not with noise But do start!"
DESCRIPTION = "Start with silence, not with noise. But do start! \
 \
Pylint-ignore is a wrapper around Pylint that maintains a pylint-ignore.md file. \
This file is used to ignore Pylint messages without adding comments to the \
source code itself. It's similar to Rupocop's .rubocop_todo.yml."
LICENSE = "MIT"

PV = "2022.1025"

RPM_NAME = "python310-pylint-ignore-2022.1025-3.1.noarch.rpm"
RPM_HASH = "4d6288002d750297e9ee67425af251ad18a5ada33c1ddf79e1cc5ce11b00c6a54b8db7e1726806828b7db813227b50bb545fa69b188cbe8b9b7d8686c28765eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylint-ignore \
python3.10dist-pylint-ignore \
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
