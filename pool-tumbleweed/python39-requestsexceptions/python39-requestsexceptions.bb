SUMMARY = "Import exceptions from potentially bundled packages in requests"
DESCRIPTION = "The python requests library bundles the urllib3 library, however, some \
software distributions modify requests to remove the bundled library. \
This makes some operations, such as supressing the 'insecure platform \
warning' messages that urllib emits difficult.  This is a simple \
library to find the correct path to exceptions in the requests library \
regardless of whether they are bundled."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python39-requestsexceptions-1.4.0-2.8.noarch.rpm"
RPM_HASH = "b1da3b28a70e8d3f7eee72479cb86f7263c9fefb36329af3ba64743791d7fc82b70a4f7c4638f71df0012bffb9d8a32df7dd9852f5c20b063747c1c88dcece20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requestsexceptions \
python39-requestsexceptions \
python3dist-requestsexceptions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
