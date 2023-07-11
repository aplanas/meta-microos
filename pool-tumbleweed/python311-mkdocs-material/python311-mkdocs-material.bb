SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.18"

RPM_NAME = "python311-mkdocs-material-9.1.18-1.1.noarch.rpm"
RPM_HASH = "deb220bd1de123025cb316ab9b6b70ef4ab00fb3b67a331dd38a0afe1dba9d0eb074d37b0c780239d1f18af10ea5f04b452d3927c58dda374c1e9e16d23e6d96"
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
