SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.2.8"

RPM_NAME = "python311-mkdocs-material-9.2.8-1.1.noarch.rpm"
RPM_HASH = "2e7b8f845f0df5d982ad68bb51166a6d5895c07515edf0e5c806364f87c383eb73aecd19041e7e2d33c6595e86a6aee71a537dceff5644c391336a9dd5f98d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-material \
python3.11dist-mkdocs-material \
python311-mkdocs-material \
python3dist-mkdocs-material"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-Markdown \
python311-colorama \
python311-mkdocs \
python311-mkdocs-material-extensions \
python311-pygments \
python311-pymdown-extensions \
python311-regex \
python311-requests"

inherit rpm
