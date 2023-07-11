SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python310-aspectlib-2.0.0-1.3.noarch.rpm"
RPM_HASH = "3377a1c2ea792be93da1d7779373ca0e82f7e652cc19063646989f81b7ee6ca58da33de2544e0e0d9847d301c264d456682648fb1b2c8c3a8b882cbd30c75518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aspectlib \
python310-aspectlib \
python3dist-aspectlib"

RDEPENDS:${PN} += "python-abi \
python310-fields"

inherit rpm
