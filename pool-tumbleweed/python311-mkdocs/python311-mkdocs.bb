SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.5.1"

RPM_NAME = "python311-mkdocs-1.5.1-1.1.noarch.rpm"
RPM_HASH = "dbfde0eef873418782619286a11f825b048c577a793c59d464721592ee2bfc982a8d92429188d4510a7b35cf672b0c0669640b5bccf4bb7e1dac616b1e185b1b"
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
