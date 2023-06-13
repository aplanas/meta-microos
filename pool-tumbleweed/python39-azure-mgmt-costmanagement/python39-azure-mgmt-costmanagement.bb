SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-azure-mgmt-costmanagement-4.0.0-1.1.noarch.rpm"
RPM_HASH = "b361c2361e66ccdc140d1cef7a9acc748a47f4a4f52a37a0b531694d6834935920f6be93bfe779c71389371a1e0016905fdd4a4eea7d2a69da509e6f4c6fc52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-costmanagement) \
python39-azure-mgmt-costmanagement \
python3dist(azure-mgmt-costmanagement)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
