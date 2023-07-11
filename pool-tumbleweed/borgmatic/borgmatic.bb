SUMMARY = "Automation tool for borgbackup"
DESCRIPTION = "borgmatic is a Python wrapper script for the Borg backup software \
that initiates a backup, prunes any old backups according to a \
retention policy, and validates backups for consistency. The script \
supports specifying your settings in a declarative configuration file \
rather than having to put them all on the command-line, and handles \
common errors."
LICENSE = "GPL-3.0-only"

PV = "1.7.15"

RPM_NAME = "borgmatic-1.7.15-1.1.noarch.rpm"
RPM_HASH = "30a61e072a2f000023940289816b166ddd680b8e7f86120bf0f4adb5c6019ba1ec225f9fc3dc75ad0e4256e43e0c05e63cdc43f651ac44f75216d8ebfcf3ddc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgmatic \
config-borgmatic \
python3.11dist-borgmatic \
python3dist-borgmatic"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
borgbackup \
python-abi \
python3-colorama \
python3-jsonschema \
python3-requests \
python3-ruamel.yaml \
python3-setuptools"

inherit rpm
