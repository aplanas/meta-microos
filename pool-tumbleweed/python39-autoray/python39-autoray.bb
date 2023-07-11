SUMMARY = "A lightweight python automatic-array library"
DESCRIPTION = "Write backend agnostic numeric code compatible with any numpy-ish array library."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "python39-autoray-0.6.3-1.3.noarch.rpm"
RPM_HASH = "09cb3f9df33d3718b1e9bd2a5b110869ed277054f2d91bb1f601bf374bd1fdbb8621ee17156cbe043eaebee814bdb8f716fded8b402453bebbf8c7cf1f33d8d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autoray \
python39-autoray \
python3dist-autoray"

RDEPENDS:${PN} += "python-abi"

inherit rpm
