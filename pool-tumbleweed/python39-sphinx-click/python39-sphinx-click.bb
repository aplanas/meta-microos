SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python39-sphinx-click-4.4.0-2.1.noarch.rpm"
RPM_HASH = "bb0501d1bb0e43edae47bd200b329db646317828bbe63e23800f14238762f96c7e2fcd30de07213d2e1bba0e38e2e28c5a36a5a6e52f2778393e3dead78e6035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-click \
python39-sphinx-click \
python3dist-sphinx-click"

RDEPENDS:${PN} += "python-abi \
python3.9dist-click \
python3.9dist-docutils \
python3.9dist-sphinx"

inherit rpm
