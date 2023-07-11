SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python310-sphinx-click-4.4.0-2.2.noarch.rpm"
RPM_HASH = "96cc9df2ea19a6295b5c7421451546a8ab75d2a621774092e691ad68369a3e885871a504b10a4a38ac6cd3b3ebbb28edd54485b9b6d94825c0ec8ad16f147e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-click \
python310-sphinx-click \
python3dist-sphinx-click"

RDEPENDS:${PN} += "python-abi \
python3.10dist-click \
python3.10dist-docutils \
python3.10dist-sphinx"

inherit rpm
