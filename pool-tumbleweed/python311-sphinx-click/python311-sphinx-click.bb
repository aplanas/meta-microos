SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python311-sphinx-click-4.4.0-2.1.noarch.rpm"
RPM_HASH = "3202962d8da915aa8ed6e0450eb9fe1b7e1429f1cf8042dcbe8aba5dfdfdd8ec3f3f5104b17ac8c88755bac15e0f11b545bff3fb19eef5ac4061c5ad12d79f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-click \
python311-sphinx-click \
python3dist-sphinx-click"

RDEPENDS:${PN} += "python-abi \
python3.11dist-click \
python3.11dist-docutils \
python3.11dist-sphinx"

inherit rpm
