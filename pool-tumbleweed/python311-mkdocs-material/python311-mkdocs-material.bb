SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.15"

RPM_NAME = "python311-mkdocs-material-9.1.15-1.1.noarch.rpm"
RPM_HASH = "83df992157736c1ecfed7d85a25e089610410e58cb475ffaf03ad4c5ebd9d4bc3a563deaec7db8069c89fac19519a7bd3648791c0f5e86d0799fa92b2f63512a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mkdocs-material \
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
