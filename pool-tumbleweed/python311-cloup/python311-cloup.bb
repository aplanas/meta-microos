SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python311-cloup-2.1.1-1.3.noarch.rpm"
RPM_HASH = "6eef7f0c8b88bfb526b0aa0ca20032f90990867e2db11bf8f0da2d18f4999543c5d7980c4f353b3453dc3177e8ee03fbdad8e7b2d2c7d85cc025a8f96bd1d6ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloup \
python3.11dist-cloup \
python311-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
