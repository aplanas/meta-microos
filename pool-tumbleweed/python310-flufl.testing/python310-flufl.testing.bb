SUMMARY = "A small collection of test tool plugins"
DESCRIPTION = "A small collection of test tool plugins"
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python310-flufl.testing-0.8-2.1.noarch.rpm"
RPM_HASH = "36aed3e27920e377c78b8c34f8d349de974eb22aaaba70f29964338845f4c93f5d9c2223e884f3ece7f5bb2d1160cbfef60397c298f0311993c27db2f54496f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flufl.testing \
python310-flufl.testing \
python3dist-flufl.testing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
