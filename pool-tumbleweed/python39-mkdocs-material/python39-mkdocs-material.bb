SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.19"

RPM_NAME = "python39-mkdocs-material-9.1.19-1.1.noarch.rpm"
RPM_HASH = "1a619a27ac7500227e0b8e38f8d524c82bbf9cc327607f709b3bdfebaf38f4515746192e58e8137498ff96b76a93e032509361094f19d7410df1eeb6babc14e5"
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
