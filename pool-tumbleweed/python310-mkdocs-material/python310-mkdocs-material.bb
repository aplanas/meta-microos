SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.15"

RPM_NAME = "python310-mkdocs-material-9.1.15-1.1.noarch.rpm"
RPM_HASH = "969e5f4e369c9fcbc2f963289a7125505322e55d9f03bca8626fe1552ccb928fb5d3d31cfc9a706ea84a8d10c26c97c24c74793d8495ca04b10a63528398fb11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-material \
python3.10dist-mkdocs-material \
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
