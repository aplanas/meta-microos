SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "python310-mkdocs-1.4.2-2.1.noarch.rpm"
RPM_HASH = "af7d2024ae60bae76501eda2a6b18bdcde6925fc321a3d3e4149f8050047842f2884005c8c25abee6661dd5facf9b35234f659e6959d43a7348c5e5048cf0fd5"
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
