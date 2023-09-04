SUMMARY = "Development utilities by jaraco"
DESCRIPTION = "Development utilities by jaraco"
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python310-jaraco.develop-8.2.0-1.1.noarch.rpm"
RPM_HASH = "7809d47baeb4bf6019be95d4d36a5cae6a734998f02f2d072482c3561dd11e0d834c57baa1c91cb4e89101a45586e42986de026ac2ab04d74ff4e999f57ed269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.develop \
python310-jaraco.develop \
python3dist-jaraco.develop"

RDEPENDS:${PN} += "python-abi \
python310-PyNaCl \
python310-autocommand \
python310-build \
python310-jaraco.collections \
python310-jaraco.context \
python310-jaraco.ui \
python310-jaraco.vcs \
python310-keyring \
python310-packaging \
python310-path \
python310-requests-toolbelt \
python310-setuptools \
python310-subprocess-tee"

inherit rpm
