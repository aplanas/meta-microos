SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python311-quantities-0.14.1-1.4.noarch.rpm"
RPM_HASH = "c8657dc598f7e65e3b91dd665d8cc9970692ae5684bd834f258f0e5b837fda6f09bb24bdfb58996d2b6e52ca3529eb6c3d0a4667a340f811d526ac5293d02e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-quantities \
python3.11dist-quantities \
python311-quantities \
python3dist-quantities"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm
