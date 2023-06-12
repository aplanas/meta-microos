SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2023.4.21"

RPM_NAME = "python39-sphinx-inline-tabs-2023.4.21-1.1.noarch.rpm"
RPM_HASH = "b43adf26d34bac78e5a7dbff1c242a2acd24c05f356e4f78f58c067a6d705bd150fdaf0ceadb94f454f215b1e214be9b73239059971987f330e13299365945b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-inline-tabs) \
python39-sphinx-inline-tabs \
python3dist(sphinx-inline-tabs)"
RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
