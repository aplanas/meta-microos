SUMMARY = "Import exceptions from potentially bundled packages in requests"
DESCRIPTION = "The python requests library bundles the urllib3 library, however, some \
software distributions modify requests to remove the bundled library. \
This makes some operations, such as supressing the 'insecure platform \
warning' messages that urllib emits difficult.  This is a simple \
library to find the correct path to exceptions in the requests library \
regardless of whether they are bundled."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python310-requestsexceptions-1.4.0-2.8.noarch.rpm"
RPM_HASH = "d90cc2ba5c76516315ea66b040bc858543c094c89cb44cc14e0fb4717877c51cce571ff61ca0284ecef0e8a33d14a07d4eb362308c7e7c47e6ec2358d8b3c3a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requestsexceptions \
python3.10dist-requestsexceptions \
python310-requestsexceptions \
python3dist-requestsexceptions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
