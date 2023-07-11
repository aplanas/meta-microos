SUMMARY = "Suite of tools and fixtures to manage daemons for testing"
DESCRIPTION = "Pifpaf is a suite of `fixtures`_ and a command-line tool that allows to start \
and stop daemons for a quick throw-away usage. This is typically useful when \
needing these daemons to run `integration testing`_. It originaly evolved from \
its precussor `overtest`_."
LICENSE = "Apache-2.0"

PV = "3.1.5"

RPM_NAME = "python39-pifpaf-3.1.5-2.6.noarch.rpm"
RPM_HASH = "0e47e5478458f99ab56e4048cc85e1ed34f3097db9e3a4c229866c37ff5e0089eb86d25f7530d24bddf8c032927abdd491225529dc7aa481781f3b3021357fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pifpaf \
python39-pifpaf \
python3dist-pifpaf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-click \
python39-daiquiri \
python39-fixtures \
python39-psutil \
python39-requests \
python39-testrepository \
python39-testtools \
python39-xattr \
update-alternatives"

inherit rpm
