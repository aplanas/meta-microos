SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python39-sphinx-click-4.4.0-2.2.noarch.rpm"
RPM_HASH = "758466dadd2192ab4996facb3a73481432d1e00ed33e825cb3433a0a0d393eb3d96e5fb1987ce187723e4a85d62a13584e94b22cf5c520beae04a4ed12693803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-click \
python39-sphinx-click \
python3dist-sphinx-click"

RDEPENDS:${PN} += "python-abi \
python3.9dist-click \
python3.9dist-docutils \
python3.9dist-sphinx"

inherit rpm
