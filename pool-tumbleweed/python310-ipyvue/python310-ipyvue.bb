SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python310-ipyvue-1.9.2-1.1.noarch.rpm"
RPM_HASH = "782640d910d387095e5b80071d393ea766602ed29b618cb3ca7c9304c08df43e5b7e2efc623d22ecc27b3cac772eaa0b3fbbffef553ff56104a18b1896c82572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyvue \
python310-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python310-ipywidgets"

inherit rpm
