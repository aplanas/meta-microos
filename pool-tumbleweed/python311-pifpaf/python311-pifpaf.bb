SUMMARY = "Suite of tools and fixtures to manage daemons for testing"
DESCRIPTION = "Pifpaf is a suite of `fixtures`_ and a command-line tool that allows to start \
and stop daemons for a quick throw-away usage. This is typically useful when \
needing these daemons to run `integration testing`_. It originaly evolved from \
its precussor `overtest`_."
LICENSE = "Apache-2.0"

PV = "3.1.5"

RPM_NAME = "python311-pifpaf-3.1.5-2.6.noarch.rpm"
RPM_HASH = "e4986cad1b2d78c7eac19cb7e640fcde4af6bd111e6c15e6b26297e04df16e23bf2091bb16f078c52037f40fc607af210918acc1b5b849576d91effc8f57db1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pifpaf \
python3.11dist-pifpaf \
python311-pifpaf \
python3dist-pifpaf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-click \
python311-daiquiri \
python311-fixtures \
python311-psutil \
python311-requests \
python311-testrepository \
python311-testtools \
python311-xattr \
update-alternatives"

inherit rpm
