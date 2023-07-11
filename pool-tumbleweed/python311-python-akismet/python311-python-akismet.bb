SUMMARY = "Akismet v1.1 module for Python"
DESCRIPTION = "Akismet v1.1 module for Python."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python311-python-akismet-0.4.3-1.5.noarch.rpm"
RPM_HASH = "91edf4121ac916769fb394be5ac87d00d18aaa96b07de538343a77030de56a5719fcba7e3078d39a46f3c5482edbe973cb32428980b652e3d6b1fd26e1a69b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-akismet \
python3.11dist-python-akismet \
python311-python-akismet \
python3dist-python-akismet"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
