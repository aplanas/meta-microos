SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python311-sphinx-click-4.4.0-2.2.noarch.rpm"
RPM_HASH = "aa9be2b2b5965c9792e5786c0887a5e1ce46eaea7cb46e3be296edf937a1bbc09c0caa434f47faf6a61596c5c6fb767027e8d18d116ba9dcfd23468393da2e0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-click \
python3.11dist-sphinx-click \
python311-sphinx-click \
python3dist-sphinx-click"

RDEPENDS:${PN} += "python-abi \
python3.11dist-click \
python3.11dist-docutils \
python3.11dist-sphinx"

inherit rpm
