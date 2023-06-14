SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "python310-mkdocs-1.4.2-1.2.noarch.rpm"
RPM_HASH = "49e24cb13ab6ce2c533a84518dc2d1e1b206ba28bb789d71cf7e3389cdb2465625e29593c2c0f5b7e14d562ea665cc31d972388bda9469e5f4c213fffb30936d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs \
python3.10dist-mkdocs \
python310-mkdocs \
python3dist-mkdocs"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
fontawesome-fonts \
fontawesome-fonts-web \
python-abi \
python310-Jinja2 \
python310-Markdown \
python310-MarkupSafe \
python310-PyYAML \
python310-click \
python310-ghp-import \
python310-importlib-metadata \
python310-mergedeep \
python310-packaging \
python310-pyyaml-env-tag \
python310-watchdog \
update-alternatives"

inherit rpm
