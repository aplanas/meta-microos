SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-pathtools-0.1.2-15.2.noarch.rpm"
RPM_HASH = "5afc7f27474c30de186249bfbafc589b94e16c3ca3c88ae730abc97e9998f4593af635473926818121437941700aee8d773dc9c799ef099a42375df4eeeaa0ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathtools \
python3.11dist-pathtools \
python311-pathtools \
python3dist-pathtools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
