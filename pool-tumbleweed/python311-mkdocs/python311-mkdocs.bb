SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.5.2"

RPM_NAME = "python311-mkdocs-1.5.2-1.1.noarch.rpm"
RPM_HASH = "9d90abdbbbdb733de4fe88a5eda935b8573cca6a6f0fd7fa503f0c3419f3f2b2e44e7d36f02245370ccc56dd46f7207be97d9fd7d233a963c09e87708ddb586f"
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
