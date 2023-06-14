SUMMARY = "Provide package versions with version control data"
DESCRIPTION = "Python module to provide package versions with version control data."
LICENSE = "MIT"

PV = "0.2.12"

RPM_NAME = "python311-vcver-0.2.12-1.3.noarch.rpm"
RPM_HASH = "f8f8fdd20754c8731a9d99051f8b959d18c5e59f3f08fd406e0a04004e7e6ef01957d82aa475db67801ac470549b2e37d5313b7469b0c30bcbcf99226a52c538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-vcver \
python311-vcver \
python3dist-vcver"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm
