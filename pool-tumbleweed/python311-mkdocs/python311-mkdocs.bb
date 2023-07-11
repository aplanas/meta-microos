SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "python311-mkdocs-1.4.2-2.1.noarch.rpm"
RPM_HASH = "ea069e2509cf4c5cca3067549659ae9a76f0bdb895fc3bae8cd9f44730b761273bcabb6c0be3c5a1c873d31629b75ec2be1631c736effa03b8bb0711132e1a45"
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
python311-pyyaml-env-tag \
python311-watchdog \
update-alternatives"

inherit rpm
