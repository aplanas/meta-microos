SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.19"

RPM_NAME = "python310-mkdocs-material-9.1.19-1.1.noarch.rpm"
RPM_HASH = "3f4a3502a716a4f5c5694f70749ad9b49bc0260504ebae5c06d0a3b8bb575759cd86e43b98fa4d8a33d1677e1e1013204278892cc9e95e2710f5d83ee51d6fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mkdocs-material \
python310-mkdocs-material \
python3dist-mkdocs-material"

RDEPENDS:${PN} += "python-abi \
python310-Markdown \
python310-colorama \
python310-jinja2 \
python310-mkdocs \
python310-mkdocs-material-extensions \
python310-pygments \
python310-pymdown-extensions \
python310-regex \
python310-requests"

inherit rpm
