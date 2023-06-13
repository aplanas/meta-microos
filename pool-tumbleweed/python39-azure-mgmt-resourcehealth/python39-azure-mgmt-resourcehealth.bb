SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-mgmt-resourcehealth-1.0.0b4-1.1.noarch.rpm"
RPM_HASH = "208153ea7c0cef7e074c8cce7b00fb44bc74dc729882116976b47eab8c456811adc03e92b8d98cbd074484739aaf33eca21982fb021630a840c1ade2afc770d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-resourcehealth) \
python39-azure-mgmt-resourcehealth \
python3dist(azure-mgmt-resourcehealth)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
