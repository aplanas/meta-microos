SUMMARY = "Start with silence, not with noise But do start!"
DESCRIPTION = "Start with silence, not with noise. But do start! \
 \
Pylint-ignore is a wrapper around Pylint that maintains a pylint-ignore.md file. \
This file is used to ignore Pylint messages without adding comments to the \
source code itself. It's similar to Rupocop's .rubocop_todo.yml."
LICENSE = "MIT"

PV = "2022.1025"

RPM_NAME = "python311-pylint-ignore-2022.1025-3.3.noarch.rpm"
RPM_HASH = "7d0cbbd492e2b53b2856ca81b6ae6179622b93d06b80e765e71f0c6592d8520dd1755903f5021614d5ba85086af353936ed7a6db714f9c4ff0e1c9a55389b95d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylint-ignore \
python3.11dist-pylint-ignore \
python311-pylint-ignore \
python3dist-pylint-ignore"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-astroid \
python311-pylev \
python311-pylint \
update-alternatives"

inherit rpm
