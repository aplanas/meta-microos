SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.21"

RPM_NAME = "python311-mkdocs-material-9.1.21-1.1.noarch.rpm"
RPM_HASH = "4aa96f5f9253d4e48897f4438346c073b0ded902c185e250610971c93e2268b191ec241e888929f8fdb7a190cce193cc03bf515d418a0cdba97b8eac579f51d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-material \
python3.11dist-mkdocs-material \
python311-mkdocs-material \
python3dist-mkdocs-material"

RDEPENDS:${PN} += "python-abi \
python311-Markdown \
python311-colorama \
python311-jinja2 \
python311-mkdocs \
python311-mkdocs-material-extensions \
python311-pygments \
python311-pymdown-extensions \
python311-regex \
python311-requests"

inherit rpm
