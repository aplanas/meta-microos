SUMMARY = "Import exceptions from potentially bundled packages in requests"
DESCRIPTION = "The python requests library bundles the urllib3 library, however, some \
software distributions modify requests to remove the bundled library. \
This makes some operations, such as supressing the 'insecure platform \
warning' messages that urllib emits difficult.  This is a simple \
library to find the correct path to exceptions in the requests library \
regardless of whether they are bundled."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python311-requestsexceptions-1.4.0-2.10.noarch.rpm"
RPM_HASH = "1a86fdc0b95878a704afaa6e1e481317cc4119a756577cc039b7f6c5b8bbe3885255c4fc3723fbc3a6e4a0dec59d1232135a4bcd9fac4325c33bbec5b3d0dc06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requestsexceptions \
python3.11dist-requestsexceptions \
python311-requestsexceptions \
python3dist-requestsexceptions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
