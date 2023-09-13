SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.2.8"

RPM_NAME = "python310-mkdocs-material-9.2.8-1.1.noarch.rpm"
RPM_HASH = "80fae0e4e7202ba1d7b795355a48007ed3aea1e8550e60f2161fa92f2b3f34a8e84f1b7ddd50ebe3d932df46f69c455d7dd3f4bba84ad16aec91ed7ea03fdc17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mkdocs-material \
python310-mkdocs-material \
python3dist-mkdocs-material"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-Markdown \
python310-colorama \
python310-mkdocs \
python310-mkdocs-material-extensions \
python310-pygments \
python310-pymdown-extensions \
python310-regex \
python310-requests"

inherit rpm
