SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python311-azure-eventgrid-4.13.0-1.2.noarch.rpm"
RPM_HASH = "1e88c1e689b2fade7a9759a43a52633dc3d2317776169ab01830b71f1913a711f384d1c3846167999031c5294f45a1eb7be412f51d938d73815e1bb66d0622cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventgrid \
python3.11dist-azure-eventgrid \
python311-azure-eventgrid \
python3dist-azure-eventgrid"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-isodate"

inherit rpm
