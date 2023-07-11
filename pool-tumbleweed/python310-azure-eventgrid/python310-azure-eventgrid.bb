SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python310-azure-eventgrid-4.13.0-1.2.noarch.rpm"
RPM_HASH = "c29153666ea6f8fc627305196cd71eb158b8d9d2cc9a8fa9568677af50a1c42a6d71dff4a60d74d54b80082f77490eb2c72210f7380d1c2813a07d62dbb6186f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-eventgrid \
python310-azure-eventgrid \
python3dist-azure-eventgrid"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-isodate"

inherit rpm
