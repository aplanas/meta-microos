SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python310-sphinx-click-4.4.0-2.1.noarch.rpm"
RPM_HASH = "79d7cfbbd89188fce8e22b09fe3e4a6d6227a0839860e7227c6690548d869ada7c9447e8c55d4536e83d05ebe151f8dc38562d98de18645e229ecfec188c56fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-click \
python3.10dist(sphinx-click) \
python310-sphinx-click \
python3dist(sphinx-click)"

RDEPENDS:${PN} += "python(abi) \
python3.10dist(click) \
python3.10dist(docutils) \
python3.10dist(sphinx)"

inherit rpm
