SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2023.4.21"

RPM_NAME = "python311-sphinx-inline-tabs-2023.4.21-1.3.noarch.rpm"
RPM_HASH = "726409ef1a3af52b8f8bac401c2562a210862f33f91d1595bf8d8aff03583306db7d71016275f825158dcc575bdbbd192e2a497c56d9b652757c674a1e640800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-inline-tabs \
python3.11dist-sphinx-inline-tabs \
python311-sphinx-inline-tabs \
python3dist-sphinx-inline-tabs"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
