SUMMARY = "Development utilities by jaraco"
DESCRIPTION = "Development utilities by jaraco"
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python311-jaraco.develop-8.2.0-1.1.noarch.rpm"
RPM_HASH = "f23e0fc170a36f42859c3e83790a98012bdac369f1104ca321529058a04e67e2345d2bae0300f4926e970ac43d089532c8d527c0c3e82c3c44420fd5f31b93de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.develop \
python3.11dist-jaraco.develop \
python311-jaraco.develop \
python3dist-jaraco.develop"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-autocommand \
python311-build \
python311-jaraco.collections \
python311-jaraco.context \
python311-jaraco.ui \
python311-jaraco.vcs \
python311-keyring \
python311-packaging \
python311-path \
python311-requests-toolbelt \
python311-setuptools \
python311-subprocess-tee"

inherit rpm
