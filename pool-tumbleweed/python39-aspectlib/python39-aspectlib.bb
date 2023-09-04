SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python39-aspectlib-2.0.0-2.1.noarch.rpm"
RPM_HASH = "fee81a57718bae12e7f834aa2c5f5114547a0dd6ea1ee562496ca77ebc9c8276a99aa7a1e4c07db88bb724442e92346a608f3a362008e611cd0c55c425a316ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aspectlib \
python39-aspectlib \
python3dist-aspectlib"

RDEPENDS:${PN} += "python-abi \
python39-fields"

inherit rpm
