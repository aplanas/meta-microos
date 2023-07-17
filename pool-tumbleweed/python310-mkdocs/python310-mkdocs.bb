SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.4.3"

RPM_NAME = "python310-mkdocs-1.4.3-1.1.noarch.rpm"
RPM_HASH = "a09ad5134cb412cc29d00154349792e02ee51cb33e9978579c859f6ac4574ef216bd8825cc7c41ac8096b3417ee9fb19b145882518c0797a2d12cbc3fafc1301"
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
python310-pyyaml-env-tag \
python310-watchdog \
update-alternatives"

inherit rpm
