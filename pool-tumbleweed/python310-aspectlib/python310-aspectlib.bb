SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python310-aspectlib-2.0.0-1.1.noarch.rpm"
RPM_HASH = "c4a879a8aa96d4d76fcac10037ff347579dac3dac42f0c77a02b7b3665ac5a14755f1fe4daf898aceec690e64b0a24641849e7eb605f8434969b085c4f4b6184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aspectlib \
python3.10dist(aspectlib) \
python310-aspectlib \
python3dist(aspectlib)"

RDEPENDS:${PN} += "python(abi) \
python310-fields"

inherit rpm
