SUMMARY = "A library for managing DNS zones"
DESCRIPTION = "A simple library for managing DNS zones."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "python39-localzone-0.9.8-1.3.noarch.rpm"
RPM_HASH = "5ef027762285eb850f68c8dcb2237075b007756222a5b33b4bc5637db0f8b3e50a30c546c3179dab2764e355782ae070ba1a2c424569d6c876c9cdaa33e89580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-localzone \
python39-localzone \
python3dist-localzone"

RDEPENDS:${PN} += "python-abi \
python39-dnspython"

inherit rpm
