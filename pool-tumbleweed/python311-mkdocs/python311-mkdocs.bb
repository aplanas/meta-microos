SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.4.3"

RPM_NAME = "python311-mkdocs-1.4.3-1.1.noarch.rpm"
RPM_HASH = "d5146ac6118501d5458fb6ee7e940ec2e78323e422ce61aeb94144e17b71ba1ca592a49b77b2d7ad4608876a458049b3dd2bd2158ea7012d6e42f357a891bfa1"
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
