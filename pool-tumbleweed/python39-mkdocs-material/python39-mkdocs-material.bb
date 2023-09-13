SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.2.8"

RPM_NAME = "python39-mkdocs-material-9.2.8-1.1.noarch.rpm"
RPM_HASH = "6b00065e5d236c84df3582e20d8820e35d8bf4f5cb6d615b7994d21e00163c0a1d89381308fa644a9c8f4358f46407146b832b48f00fb77c869f221ade0f9b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mkdocs-material \
python39-mkdocs-material \
python3dist-mkdocs-material"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-Markdown \
python39-colorama \
python39-mkdocs \
python39-mkdocs-material-extensions \
python39-pygments \
python39-pymdown-extensions \
python39-regex \
python39-requests"

inherit rpm
