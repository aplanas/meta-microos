SUMMARY = "Flake8 plugin that checks the ordering of import statements"
DESCRIPTION = "Flake8 and pylama plugin that checks the ordering of import statements."
LICENSE = "LGPL-3.0-only"

PV = "0.18.2"

RPM_NAME = "python310-flake8-import-order-0.18.2-1.6.noarch.rpm"
RPM_HASH = "6698fd3664fbf84eacac73b8dbc8074d2e077eadf1d443275290766fbd14432bd5c1b07ac5bbc451fbd8f9e77b6bdbc0997d42c9fb72068e34fe6e365c66a36e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-import-order \
python310-flake8-import-order \
python3dist-flake8-import-order"

RDEPENDS:${PN} += "python-abi \
python310-flake8 \
python310-pycodestyle"

inherit rpm
