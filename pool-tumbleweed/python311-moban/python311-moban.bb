SUMMARY = "Yet another jinja2 CLI for static text generation"
DESCRIPTION = "moban (模板) is yet another jinja2 CLI for static text generation. \
 \
moban brings the template engine (JINJA2) for web into static text \
generation. It is used in the pyexcel project to keep documentation \
consistent across the documentations of individual libraries."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python311-moban-0.8.2-2.6.noarch.rpm"
RPM_HASH = "04ccd0a65c4314a1546b766e0c1be704babd2288e6ab1ae3b10bc88b39bfb938738b6333f6aea205e2221bddba66f8dfe0c18914c1f93197294c4565ab9b456c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-moban \
python311-moban \
python3dist-moban"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
git-core \
python-abi \
python311-Jinja2 \
python311-appdirs \
python311-crayons \
python311-fs \
python311-jinja2-fsloader \
python311-lml \
python311-ruamel.yaml \
update-alternatives"

inherit rpm
