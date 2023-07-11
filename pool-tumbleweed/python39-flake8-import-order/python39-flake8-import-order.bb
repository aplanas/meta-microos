SUMMARY = "Flake8 plugin that checks the ordering of import statements"
DESCRIPTION = "Flake8 and pylama plugin that checks the ordering of import statements."
LICENSE = "LGPL-3.0-only"

PV = "0.18.2"

RPM_NAME = "python39-flake8-import-order-0.18.2-1.6.noarch.rpm"
RPM_HASH = "5eb52e875e4dc9a6b7f30f92e33a2dda49aaae9787a2dc8e295a2d8e37fefc3159fc4822debe4a27acbf36f3c55927cc0c602c31a8c01765df9615ca6993ab22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-import-order \
python39-flake8-import-order \
python3dist-flake8-import-order"

RDEPENDS:${PN} += "python-abi \
python39-flake8 \
python39-pycodestyle"

inherit rpm
