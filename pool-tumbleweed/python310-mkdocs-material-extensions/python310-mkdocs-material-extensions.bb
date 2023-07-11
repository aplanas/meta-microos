SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "Extension pack for Python Markdown"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-mkdocs-material-extensions-1.1.1-2.2.noarch.rpm"
RPM_HASH = "d012f1d6de2bf056bf83799e91d009d8212abd9de8aa6336cbd972b3a7609bee5fb832b9135710150ba1c205b161e4e3322dad5dc809d3b7238be96445e6901e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mkdocs-material-extensions \
python310-mkdocs-material-extensions \
python3dist-mkdocs-material-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
