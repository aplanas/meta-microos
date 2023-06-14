SUMMARY = "A tool for discovering and downloading publicly available satellite imagery"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-sat-search-0.3.0-1.4.noarch.rpm"
RPM_HASH = "7f45a7dd74c899679c021248449f1b4fa327584ee6063ee00861dfa02826dc605cec5dde1333d033de734c2bb68d7c9f8f492d962704019ea00ebcc2a0c841c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sat-search \
python3.10dist-sat-search \
python310-sat-search \
python3dist-sat-search"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-sat-stac \
update-alternatives"

inherit rpm
