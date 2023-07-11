SUMMARY = "PySMB wrapper library"
DESCRIPTION = "easypysmb is a Python library that wraps around the pysmb library."
LICENSE = "GPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python39-easypysmb-1.4.4-1.13.noarch.rpm"
RPM_HASH = "a428fb8658f9fe1e122e3e93e7f568a3204a4ddff3bd528e3985730c326cc91e16351d26c7af772684c84d669f8b71518bdf67457156c31e75cd2a9da6f4f92f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-easypysmb \
python39-easypysmb \
python3dist-easypysmb"

RDEPENDS:${PN} += "python-abi \
python39-pysmb"

inherit rpm
