SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.5.2"

RPM_NAME = "python310-mkdocs-1.5.2-1.1.noarch.rpm"
RPM_HASH = "3f9521f88f0476eaeb716e77c2805051a3bc4e4d40fa3f5383d847f686c7948b66d855478d02eb5fc3e25088d48875cdf8982f8c7eb4cc2117bf65fd3be286cd"
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
