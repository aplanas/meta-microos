SUMMARY = "Import exceptions from potentially bundled packages in requests"
DESCRIPTION = "The python requests library bundles the urllib3 library, however, some \
software distributions modify requests to remove the bundled library. \
This makes some operations, such as supressing the 'insecure platform \
warning' messages that urllib emits difficult.  This is a simple \
library to find the correct path to exceptions in the requests library \
regardless of whether they are bundled."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python310-requestsexceptions-1.4.0-2.10.noarch.rpm"
RPM_HASH = "4f10b5742928b821196715bbd826b4c763365813b5d033fea1eb51627a5ba64f5d1a322ee4151504f30c52dacb5692c5bdbd126ef0e2d5966979e815340873f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requestsexceptions \
python310-requestsexceptions \
python3dist-requestsexceptions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
