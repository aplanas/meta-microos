SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python39-azure-eventgrid-4.13.0-1.2.noarch.rpm"
RPM_HASH = "f7f87326ae0c17ee69f976bb6a6d5b4c67185fd69f4f957a34f68486529d307c6fe2dd33687bc555793f6027a348775b58b6ac55da7cd9849379145293e0fead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-eventgrid \
python39-azure-eventgrid \
python3dist-azure-eventgrid"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-isodate"

inherit rpm
