SUMMARY = "Hosted coverage reports"
DESCRIPTION = "Hosted coverage reports for Github, Bitbucket and Gitlab."
LICENSE = "Apache-2.0"

PV = "2.1.13"

RPM_NAME = "python310-codecov-2.1.13-1.3.noarch.rpm"
RPM_HASH = "890d916892c22323663d81804a9127c4c9358be430dbc511c157ab1f7b412c6617baad6cc50597f3b5779f60397a55160d05253e718f72769bdb181759817db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-codecov \
python310-codecov \
python3dist-codecov"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-coverage \
python310-requests \
update-alternatives"

inherit rpm
