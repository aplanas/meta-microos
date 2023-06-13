SUMMARY = "Verification helper for libalternatives"
DESCRIPTION = "This is a testing-only installation that may be used to verify that successful \
integration with manual pages."
LICENSE = "Apache-2.0"

PV = "1.2+30.a5431e9"

RPM_NAME = "libalternatives-unit-test-helper-1.2+30.a5431e9-1.1.noarch.rpm"
RPM_HASH = "adc6b8185e0f5f4f61dc8f8d6e73efda28eff7de0a48ea9303bb5573e3fc42d1ccff9d00b8d30e57632bc4e2911247c2a163f4c3a114e590475f5304054d6290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libalternatives-unit-test-helper"

RDEPENDS:${PN} += "/bin/bash \
alts"

inherit rpm
