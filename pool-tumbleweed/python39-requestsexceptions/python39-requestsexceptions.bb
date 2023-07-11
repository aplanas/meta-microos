SUMMARY = "Import exceptions from potentially bundled packages in requests"
DESCRIPTION = "The python requests library bundles the urllib3 library, however, some \
software distributions modify requests to remove the bundled library. \
This makes some operations, such as supressing the 'insecure platform \
warning' messages that urllib emits difficult.  This is a simple \
library to find the correct path to exceptions in the requests library \
regardless of whether they are bundled."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python39-requestsexceptions-1.4.0-2.10.noarch.rpm"
RPM_HASH = "9246c8ce5273a1cb4260ffa35f558d9043407e62543559e40039fa3e2bf4c0953b9924c1ce656500a4f7b9987c79a8016afde5bd7fb10d11c499b4704e39c4a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requestsexceptions \
python39-requestsexceptions \
python3dist-requestsexceptions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
