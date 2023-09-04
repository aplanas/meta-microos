SUMMARY = "Development utilities by jaraco"
DESCRIPTION = "Development utilities by jaraco"
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python39-jaraco.develop-8.2.0-1.1.noarch.rpm"
RPM_HASH = "51ef4b7138ab167e16db3743fc364e8ba9f859cb969e8cb5f0cba24930cccb0ba13ccd96f6bc5d7e993bee1daa8d150c6d12f5a9bca8cbfebb53c8f80b437088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.develop \
python39-jaraco.develop \
python3dist-jaraco.develop"

RDEPENDS:${PN} += "python-abi \
python39-PyNaCl \
python39-autocommand \
python39-build \
python39-jaraco.collections \
python39-jaraco.context \
python39-jaraco.ui \
python39-jaraco.vcs \
python39-keyring \
python39-packaging \
python39-path \
python39-requests-toolbelt \
python39-setuptools \
python39-subprocess-tee"

inherit rpm
