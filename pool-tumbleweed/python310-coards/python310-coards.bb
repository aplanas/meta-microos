SUMMARY = "A parser for COADS-compliant dates"
DESCRIPTION = "This module parses time values represented using the COARDS \
convention."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python310-coards-1.0.5-2.15.noarch.rpm"
RPM_HASH = "83f94a211520bff8383edfff00a0515a726e46a59ffab9f493505230d89f9fe95649f90adcd67b91eb81610ca06689cf564912b8547588a879fee89621bbc524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-coards \
python310-coards \
python3dist-coards"

RDEPENDS:${PN} += "python-abi"

inherit rpm
