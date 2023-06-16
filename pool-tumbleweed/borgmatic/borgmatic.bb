SUMMARY = "Automation tool for borgbackup"
DESCRIPTION = "borgmatic is a Python wrapper script for the Borg backup software \
that initiates a backup, prunes any old backups according to a \
retention policy, and validates backups for consistency. The script \
supports specifying your settings in a declarative configuration file \
rather than having to put them all on the command-line, and handles \
common errors."
LICENSE = "GPL-3.0-only"

PV = "1.7.10"

RPM_NAME = "borgmatic-1.7.10-1.1.noarch.rpm"
RPM_HASH = "f7c5a59fed1fc6982665b57c31ae7aa27e173c65e6d1c7705deb58e7eddf5fba6f54c35df042b1e2b7bce4ded58af6105f4b7f5369b637636a14e6e245246182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgmatic \
config-borgmatic \
python3.10dist-borgmatic \
python3dist-borgmatic"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
borgbackup \
python-abi \
python3-colorama \
python3-jsonschema \
python3-pykwalify \
python3-requests \
python3-ruamel.yaml \
python3-setuptools"

inherit rpm
