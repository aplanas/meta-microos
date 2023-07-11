SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2023.4.21"

RPM_NAME = "python39-sphinx-inline-tabs-2023.4.21-1.3.noarch.rpm"
RPM_HASH = "5729183c7746855012fbb653020a904871eb1a75f4cdf34832ad0954b950f71f4535a0b260101e374dbeca56ac1f7154ee0b82161af9be581f6e733e33955504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-inline-tabs \
python39-sphinx-inline-tabs \
python3dist-sphinx-inline-tabs"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
