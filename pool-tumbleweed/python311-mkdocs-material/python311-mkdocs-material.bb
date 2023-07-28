SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.19"

RPM_NAME = "python311-mkdocs-material-9.1.19-1.1.noarch.rpm"
RPM_HASH = "3134d81bf20b7f147e9e77196732b944aecd4d10c9cce8cbc39c85885d65c3dd077216fe10d17f1ba604c76acb011dd3de5157b5f472ce58f69fe442916be791"
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
