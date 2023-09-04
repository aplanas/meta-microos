SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-pathtools-0.1.2-16.1.noarch.rpm"
RPM_HASH = "e10d6b17253423fe29fc2628ee26b7d84d7f5439c09df388656bd045db2bfdd35ce6547a6fe3788552566e5be4fbd827cd8207991f57a74ef55e149c100b175f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pathtools \
python39-pathtools \
python3dist-pathtools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
