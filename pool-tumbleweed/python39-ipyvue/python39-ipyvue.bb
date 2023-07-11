SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python39-ipyvue-1.9.2-1.1.noarch.rpm"
RPM_HASH = "9940426ba38cb4bc6a1facbca9dfcc7e06aac4cc994660b7d634f371476f2cc7f22db32a7473fca1e9024b6cbc7e9867dcf6f8c4b6c232f9df2c2640d6ca366f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyvue \
python39-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python39-ipywidgets"

inherit rpm
