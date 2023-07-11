SUMMARY = "Yet another jinja2 CLI for static text generation"
DESCRIPTION = "moban (模板) is yet another jinja2 CLI for static text generation. \
 \
moban brings the template engine (JINJA2) for web into static text \
generation. It is used in the pyexcel project to keep documentation \
consistent across the documentations of individual libraries."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python310-moban-0.8.2-2.7.noarch.rpm"
RPM_HASH = "423dd2f0d697e00709ecfadbea59f59e6568eaace9fa3dd0e9760aaf9377e04179bad04b6ad3ebc3efa15c57e9cbf7949001f2ed9447b0a7e491eeefcda2181e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-moban \
python310-moban \
python3dist-moban"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
git-core \
python-abi \
python310-Jinja2 \
python310-appdirs \
python310-crayons \
python310-fs \
python310-jinja2-fsloader \
python310-lml \
python310-ruamel.yaml \
update-alternatives"

inherit rpm
