SUMMARY = "Deduplicating block based backup software"
DESCRIPTION = "Deduplicating block based backup software for ceph/rbd, \
image files and devices."
LICENSE = "LGPL-3.0-only"

PV = "0.17.0"

RPM_NAME = "benji-0.17.0-1.3.noarch.rpm"
RPM_HASH = "9fce612f7163bd6bf270eb19b037c1c3d5790bcecf67807e16a24aee094b6349e0f571f1c65297f020f980401cee9bf73618dd396e8121e51e4e4638f1aadc51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "benji \
config-benji \
python3.11dist-benji \
python3dist-benji"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Cerberus \
python3-PrettyTable \
python3-alembic \
python3-argcomplete \
python3-colorama \
python3-dateutil \
python3-diskcache \
python3-psutil \
python3-pycryptodome \
python3-pyparsing \
python3-ruamel.yaml \
python3-semantic-version \
python3-setproctitle \
python3-shortuuid \
python3-sparse \
python3-sqlalchemy \
python3-structlog"

inherit rpm
