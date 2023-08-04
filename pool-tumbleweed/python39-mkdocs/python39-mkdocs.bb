SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.5.1"

RPM_NAME = "python39-mkdocs-1.5.1-1.1.noarch.rpm"
RPM_HASH = "7a3fdc95e992217a7f607615cc8b4f25ba8f94f9aafe5f14786a840a2e3cbc98cdfdcbe739c0322cb802b54622ae8d123dc9cd57c602dbac923966ea482a8d53"
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
