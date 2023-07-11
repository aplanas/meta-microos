SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-pathtools-0.1.2-15.2.noarch.rpm"
RPM_HASH = "1631d9df32cc191a1065b2e65517819085942ebe9903d78745443f5a1e6276ede16ead5cd91180bfd1d2d7d55cd3c025872c634047092112f35e58517f5dd110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pathtools \
python39-pathtools \
python3dist-pathtools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
