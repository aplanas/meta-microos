SUMMARY = "Yet another jinja2 CLI for static text generation"
DESCRIPTION = "moban (模板) is yet another jinja2 CLI for static text generation. \
 \
moban brings the template engine (JINJA2) for web into static text \
generation. It is used in the pyexcel project to keep documentation \
consistent across the documentations of individual libraries."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python311-moban-0.8.2-2.7.noarch.rpm"
RPM_HASH = "e5729bb17e86808ffeaff6a378dea30e1f5488bc94e8cbf555120af89d9ca96259cdfa4ee376577ef3b2ded25c48e35b09c1c74a43e7062bacfe55f9aa2a910c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moban \
python3.11dist-moban \
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
