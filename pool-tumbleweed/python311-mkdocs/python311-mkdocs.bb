SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.5.0"

RPM_NAME = "python311-mkdocs-1.5.0-1.1.noarch.rpm"
RPM_HASH = "4e6965d08638ea8b4c8f446410a6d699b067654ecd7ac753ff08af09a06e0c66936cb62803ae5c45748bfbf6a31a70f1a10d6a9581c44dda07f4c8254b1186f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs \
python3.11dist-mkdocs \
python311-mkdocs \
python3dist-mkdocs"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
fontawesome-fonts \
fontawesome-fonts-web \
python-abi \
python311-Jinja2 \
python311-Markdown \
python311-MarkupSafe \
python311-PyYAML \
python311-click \
python311-ghp-import \
python311-importlib-metadata \
python311-mergedeep \
python311-packaging \
python311-pathspec \
python311-platformdirs \
python311-pyyaml-env-tag \
python311-watchdog \
update-alternatives"

inherit rpm
