SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-pathtools-0.1.2-15.2.noarch.rpm"
RPM_HASH = "f641f57a45cd375a3367f40354b36f181a833b0b55c90cf2a91ff8ae4ca709c687c2caea503f970be28e7f73dd166dcc1fbc4bdc690e4601fab56de6030fd141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pathtools \
python310-pathtools \
python3dist-pathtools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
