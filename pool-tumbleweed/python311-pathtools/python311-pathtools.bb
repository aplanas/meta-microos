SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-pathtools-0.1.2-14.17.noarch.rpm"
RPM_HASH = "a983a8c61b0b81398bbf9acc46718484f34c8b5504933390c2b0e14ae4f7cb4b8d35cda26e13632d6f54ccbeb329305e1d7eafbe85aaa89d3bcee900e7b81b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pathtools \
python311-pathtools \
python3dist-pathtools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
