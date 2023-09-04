SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-pathtools-0.1.2-16.1.noarch.rpm"
RPM_HASH = "b0d0bbfde2ec5c605e969a0a91aa28f6e226b13c1a45032c4062d34f80145e1772d7f29d4c88f8304fe9c2d96c8f2024fdf31933634ec7bca2978e2de6f0959f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathtools \
python3.11dist-pathtools \
python311-pathtools \
python3dist-pathtools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
