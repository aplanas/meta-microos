SUMMARY = "Visual regression testing library"
DESCRIPTION = "Python client library for visual regression testing with Percy."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-percy-2.0.2-2.1.noarch.rpm"
RPM_HASH = "1315fcb0ead634c1718182bb7ca1b861b9e82b9bb6e89391acddaa6e97fc2e3c754b075ec10ac8d9283cae427d89ec2850d2c71d6ac6a045cdea8870d23655e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-percy \
python3.11dist-percy \
python311-percy \
python3dist-percy"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
