SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.5.0"

RPM_NAME = "python310-mkdocs-1.5.0-1.1.noarch.rpm"
RPM_HASH = "1ec8728b0f41ac7c66f0fb8da0ef780caa32a6e1d86ae145b0b4b7c6c381ea5c0918764095c43eec8606c08249d8a29b478b45df97d478a6c4e8375f2a2d8264"
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
