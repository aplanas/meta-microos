SUMMARY = "Yet another jinja2 CLI for static text generation"
DESCRIPTION = "moban (模板) is yet another jinja2 CLI for static text generation. \
 \
moban brings the template engine (JINJA2) for web into static text \
generation. It is used in the pyexcel project to keep documentation \
consistent across the documentations of individual libraries."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python310-moban-0.8.2-2.6.noarch.rpm"
RPM_HASH = "152d544a3f09568dfe642153ab383ae1eb9f4df1ab51d47f2e8f377407774008a8d1ba78385a0e9e4dc4d5f640ec497495d775aa890f0cca873efc5d5ea35826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moban \
python3.10dist(moban) \
python310-moban \
python3dist(moban)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
git-core \
python(abi) \
python310-Jinja2 \
python310-appdirs \
python310-crayons \
python310-fs \
python310-jinja2-fsloader \
python310-lml \
python310-ruamel.yaml \
update-alternatives"

inherit rpm
