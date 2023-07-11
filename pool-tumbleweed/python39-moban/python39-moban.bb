SUMMARY = "Yet another jinja2 CLI for static text generation"
DESCRIPTION = "moban (模板) is yet another jinja2 CLI for static text generation. \
 \
moban brings the template engine (JINJA2) for web into static text \
generation. It is used in the pyexcel project to keep documentation \
consistent across the documentations of individual libraries."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python39-moban-0.8.2-2.7.noarch.rpm"
RPM_HASH = "5d86f425d4e15ceb1b2747a865ae6081db9044bd585ba486e551888a68f5d106345acd576820226a42ca58d1a2ac09d353b453ae1c25ae623ad1438a924ce6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-moban \
python39-moban \
python3dist-moban"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
git-core \
python-abi \
python39-Jinja2 \
python39-appdirs \
python39-crayons \
python39-fs \
python39-jinja2-fsloader \
python39-lml \
python39-ruamel.yaml \
update-alternatives"

inherit rpm
