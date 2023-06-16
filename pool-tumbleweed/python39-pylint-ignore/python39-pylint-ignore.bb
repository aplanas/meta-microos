SUMMARY = "Start with silence, not with noise But do start!"
DESCRIPTION = "Start with silence, not with noise. But do start! \
 \
Pylint-ignore is a wrapper around Pylint that maintains a pylint-ignore.md file. \
This file is used to ignore Pylint messages without adding comments to the \
source code itself. It's similar to Rupocop's .rubocop_todo.yml."
LICENSE = "MIT"

PV = "2022.1025"

RPM_NAME = "python39-pylint-ignore-2022.1025-3.1.noarch.rpm"
RPM_HASH = "be854dc94798036b4c17ba9f62ee07d4a220c2f85e59abfce392f6cdc3fe4a61f6d6912ff300fda9a01494b5214d5f9cd2f79b7c43dfc30a1fa3d27564bd1c3f"
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
