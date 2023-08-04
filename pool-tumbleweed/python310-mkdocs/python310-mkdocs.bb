SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.5.1"

RPM_NAME = "python310-mkdocs-1.5.1-1.1.noarch.rpm"
RPM_HASH = "f705d3c9d0d29fe766da7a40f70993d7622ee1bc132ba2f18202b961a99b90f27d4278c748be548d9c376813244fc4bf0e93e12838ec16fa2fe8df2cb4460b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mkdocs \
python310-mkdocs \
python3dist-mkdocs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
python310-pathspec \
python310-platformdirs \
python310-pyyaml-env-tag \
python310-watchdog \
update-alternatives"

inherit rpm
