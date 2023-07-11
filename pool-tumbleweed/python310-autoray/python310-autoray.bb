SUMMARY = "A lightweight python automatic-array library"
DESCRIPTION = "Write backend agnostic numeric code compatible with any numpy-ish array library."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "python310-autoray-0.6.3-1.3.noarch.rpm"
RPM_HASH = "a97568ad63b7b8b0b2054df48d01f01cc34e5b1d9106633b626587ebed7922951aad24403a874f3f219a14ca3288d7b4a89f3f98a22ff8111c791f4c955123b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-autoray \
python310-autoray \
python3dist-autoray"

RDEPENDS:${PN} += "python-abi"

inherit rpm
