SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.5.2"

RPM_NAME = "python39-mkdocs-1.5.2-1.1.noarch.rpm"
RPM_HASH = "3924f7b54129706e2ff4b0a9f89f4fb34a790c7b38cebeb4f1844768bc3d6925348424573f412ae1c3f0977d666acf219d942a6b4ab4e5f896d793bcd76a5f50"
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
