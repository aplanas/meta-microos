SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "python311-mkdocs-1.4.2-1.2.noarch.rpm"
RPM_HASH = "4799f2bf96f56e2bcfb256ad2b34cea639dbf6f50d1b8b319fbd19f9ae994799da13760160d7359afc27f0adcf936b06cec91e2d082c19ff4f0beb86e61d2597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mkdocs \
python311-mkdocs \
python3dist-mkdocs"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
