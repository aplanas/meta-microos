SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.18"

RPM_NAME = "python310-mkdocs-material-9.1.18-1.1.noarch.rpm"
RPM_HASH = "5d20028726d7f1a12f09350e94abbc4b177e2c569948401e6b3d1f25f7bb302728a968708dcdf0a93f709ca874046d90563a0346023650f367b01a1b143abc1a"
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
