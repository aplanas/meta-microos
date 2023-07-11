SUMMARY = "Composable complex class support for attrs and dataclasses"
DESCRIPTION = "Composable complex class support for attrs and dataclasses."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python310-cattrs-22.2.0-2.3.noarch.rpm"
RPM_HASH = "8740cb3fa4389a002cf9cac3670b1a1e0d4e491e266d21d78680e701094e6bf8bbceeafd8fc9d4858bcedff14e2127587fe51c078ccb69a009dd167eed5b15ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cattrs \
python310-cattrs \
python3dist-cattrs"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
