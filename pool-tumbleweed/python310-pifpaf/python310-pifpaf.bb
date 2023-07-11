SUMMARY = "Suite of tools and fixtures to manage daemons for testing"
DESCRIPTION = "Pifpaf is a suite of `fixtures`_ and a command-line tool that allows to start \
and stop daemons for a quick throw-away usage. This is typically useful when \
needing these daemons to run `integration testing`_. It originaly evolved from \
its precussor `overtest`_."
LICENSE = "Apache-2.0"

PV = "3.1.5"

RPM_NAME = "python310-pifpaf-3.1.5-2.6.noarch.rpm"
RPM_HASH = "7b318fe2ec02626e7c8715a3560440ce88dc73aa8f003fcd5b05a8e2bc64950bf0e07b02b669ffe8f63d5b2af49a886721abc48a5839e83d5a56ceea49afb1ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pifpaf \
python310-pifpaf \
python3dist-pifpaf"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-click \
python310-daiquiri \
python310-fixtures \
python310-psutil \
python310-requests \
python310-testrepository \
python310-testtools \
python310-xattr \
update-alternatives"

inherit rpm
