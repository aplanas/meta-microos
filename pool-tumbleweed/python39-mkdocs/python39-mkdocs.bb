SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.4.3"

RPM_NAME = "python39-mkdocs-1.4.3-1.1.noarch.rpm"
RPM_HASH = "c88e0f0aedd1de60afd07431d2296de7ae5dc396baa144fa73df04aa68d308a338d6ca717c0f1212034d04dcb2a794e9c7b48a82570287f2e6491a1d50899a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mkdocs \
python39-mkdocs \
python3dist-mkdocs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
fontawesome-fonts \
fontawesome-fonts-web \
python-abi \
python39-Jinja2 \
python39-Markdown \
python39-MarkupSafe \
python39-PyYAML \
python39-click \
python39-ghp-import \
python39-importlib-metadata \
python39-mergedeep \
python39-packaging \
python39-pyyaml-env-tag \
python39-watchdog \
update-alternatives"

inherit rpm
