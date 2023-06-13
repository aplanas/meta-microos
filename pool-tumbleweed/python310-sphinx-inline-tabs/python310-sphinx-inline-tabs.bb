SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2023.4.21"

RPM_NAME = "python310-sphinx-inline-tabs-2023.4.21-1.1.noarch.rpm"
RPM_HASH = "4c77a72edc49e04ac599c4e1c4f1d069a10e797656d90d77bebeb86e3736dc10b9a7c3c2aedc8faf62dcf4cabf8f74504f9ab2063c16cd3a71d170adf44e8d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-inline-tabs \
python3.10dist(sphinx-inline-tabs) \
python310-sphinx-inline-tabs \
python3dist(sphinx-inline-tabs)"

RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
