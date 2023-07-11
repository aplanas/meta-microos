SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pluggy-1.0.0-2.3.noarch.rpm"
RPM_HASH = "3ecd8348f83451ad98a75d0a88ea45614a1aa67c97de86241fd31f74512c5000195951811c2b82674e41e5e1b65ae6a0aadda0ad0202bc61128dd25f94794751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pluggy \
python39-pluggy \
python3dist-pluggy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
