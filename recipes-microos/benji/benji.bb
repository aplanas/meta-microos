SUMMARY = "Deduplicating block based backup software"
DESCRIPTION = "Deduplicating block based backup software for ceph/rbd, \
image files and devices."
LICENSE = "LGPL-3.0-only"

PV = "0.17.0"

RPM_NAME = "benji-0.17.0-1.2.noarch.rpm"
RPM_HASH = "7db8e3a2c4bad153fee7348ac9cf3fb0d7b03a17a188c2db0aeab98879034534cc75c1a1658bc930c5b0e4a37821716b4218d4c8b1e3820402a2bb05b7945a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "benji config(benji) python3.10dist(benji) python3dist(benji)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-Cerberus python3-PrettyTable python3-alembic python3-argcomplete python3-colorama python3-dateutil python3-diskcache python3-psutil python3-pycryptodome python3-pyparsing python3-ruamel.yaml python3-semantic_version python3-setproctitle python3-shortuuid python3-sparse python3-sqlalchemy python3-structlog"

inherit rpm
