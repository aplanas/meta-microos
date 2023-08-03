SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.21"

RPM_NAME = "python39-mkdocs-material-9.1.21-1.1.noarch.rpm"
RPM_HASH = "840ba0197d5add8d4f5265b8826ed4c7a53a328b6a0363db25575c6e554012513cce9a6b5dc37fd622ebfa5d3369b47265fce19feae8a8f2b4aa7eb5b0025aa9"
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
