SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-mgmt-resourcehealth-1.0.0b4-1.1.noarch.rpm"
RPM_HASH = "94f6ef59fbcb7f805c86feb008040f84df6c44045418f0a6c338671558e669f0e3084b82f51f2308952bd5382db926424b69978703a15b945709fb87c4a3531d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-resourcehealth) \
python311-azure-mgmt-resourcehealth \
python3dist(azure-mgmt-resourcehealth)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
