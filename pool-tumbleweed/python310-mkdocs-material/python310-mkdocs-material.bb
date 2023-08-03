SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.21"

RPM_NAME = "python310-mkdocs-material-9.1.21-1.1.noarch.rpm"
RPM_HASH = "656cbd8cc5053c9a00e915f5dd92171fb07a51b9cfd5b2baa00a8a40f7e53dfb5e9ddd0612e632bc78b951c2178f58182216533ad6f798af4b830e3f91fefb6d"
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
