SUMMARY = "Import exceptions from potentially bundled packages in requests"
DESCRIPTION = "The python requests library bundles the urllib3 library, however, some \
software distributions modify requests to remove the bundled library. \
This makes some operations, such as supressing the 'insecure platform \
warning' messages that urllib emits difficult.  This is a simple \
library to find the correct path to exceptions in the requests library \
regardless of whether they are bundled."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python311-requestsexceptions-1.4.0-2.8.noarch.rpm"
RPM_HASH = "4f4c3a0d90fba6d4a23c723464dbeb83881373b445d86f4a72bcaf9efd3cbcfa506c076341b2ac2798c184207634444966f9cfcb2ad3568d21c9ef5b8ccd1d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requestsexceptions) \
python311-requestsexceptions \
python3dist(requestsexceptions)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
