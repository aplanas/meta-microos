SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python310-aspectlib-2.0.0-2.1.noarch.rpm"
RPM_HASH = "dc19419c596614463df1b9f35ac2c9730984330a58ec6e4c547a87bd647439f1164a9db624901d8092df02b0015ad135d7802ddd2e61c834529a76d9e38a7b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aspectlib \
python310-aspectlib \
python3dist-aspectlib"

RDEPENDS:${PN} += "python-abi \
python310-fields"

inherit rpm
