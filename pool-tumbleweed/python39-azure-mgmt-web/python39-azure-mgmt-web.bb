SUMMARY = "Microsoft Azure Web Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Web Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python39-azure-mgmt-web-7.1.0-1.1.noarch.rpm"
RPM_HASH = "a5846b5b79c688d80365e55b1d558bf996d550037cf8ef418542e003c141662d82545e0a42d469efff408cf23e9a881f1b2e68e55e3a6d0b3f0c10ae76159632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-web) \
python39-azure-mgmt-web \
python3dist(azure-mgmt-web)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
