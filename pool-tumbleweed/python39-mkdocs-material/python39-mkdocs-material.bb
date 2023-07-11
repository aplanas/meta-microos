SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.18"

RPM_NAME = "python39-mkdocs-material-9.1.18-1.1.noarch.rpm"
RPM_HASH = "7b6e3d2b8c4500046e6942a25ab7aef39b29f2e7a2a041431c2bc84f4c10aa7a409e183992843674deda3c133ee6a854ee33c3ff4f6038aa66afc0a5373c9b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mkdocs-material \
python39-mkdocs-material \
python3dist-mkdocs-material"

RDEPENDS:${PN} += "python-abi \
python39-Markdown \
python39-colorama \
python39-jinja2 \
python39-mkdocs \
python39-mkdocs-material-extensions \
python39-pygments \
python39-pymdown-extensions \
python39-regex \
python39-requests"

inherit rpm
