SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "Extension pack for Python Markdown"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-mkdocs-material-extensions-1.1.1-2.2.noarch.rpm"
RPM_HASH = "9c13018753ad151e96689de8b0911659c35d4d02102130964730dc24426d94534cd078a672957f80b36c680ff179d9ea8d1aa4f5a8368d606b0079c956212054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-material-extensions \
python3.11dist-mkdocs-material-extensions \
python311-mkdocs-material-extensions \
python3dist-mkdocs-material-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
