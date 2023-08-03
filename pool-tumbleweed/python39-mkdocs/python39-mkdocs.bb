SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.5.0"

RPM_NAME = "python39-mkdocs-1.5.0-1.1.noarch.rpm"
RPM_HASH = "c918e75feb325c8ee651c82cddb9955b8abe003e9e21a9d299f833c62b6788da4b7fe0c55ceb2c572a19cb19c9f619e02e7b0c69029f198a2c4ab73fec597293"
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
python39-pathspec \
python39-platformdirs \
python39-pyyaml-env-tag \
python39-watchdog \
update-alternatives"

inherit rpm
