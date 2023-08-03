SUMMARY = "Automation tool for borgbackup"
DESCRIPTION = "borgmatic is a Python wrapper script for the Borg backup software \
that initiates a backup, prunes any old backups according to a \
retention policy, and validates backups for consistency. The script \
supports specifying your settings in a declarative configuration file \
rather than having to put them all on the command-line, and handles \
common errors."
LICENSE = "GPL-3.0-only"

PV = "1.8.0"

RPM_NAME = "borgmatic-1.8.0-1.1.noarch.rpm"
RPM_HASH = "1d651a2ecf8dbc9668f0668e4b2c4d714d1eb242ad2b99b89b387f529cad1b26889c21fb24d83e9c8753678984dc4d4dfcecec43619f2d935580b468f44987bd"
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
