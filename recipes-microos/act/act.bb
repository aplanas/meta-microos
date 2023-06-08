SUMMARY = "Run your GitHub Actions locally"
DESCRIPTION = "act helps you run your Github Actions locally."
LICENSE = "MIT"

PV = "0.2.34"

RPM_NAME = "act-0.2.34-2.3.aarch64.rpm"
RPM_HASH = "313e56b1498cf1e3172262e8a16a6f5788ab8fc3b5cc8ca63a4eddce25e43bcfdafc916212285e3a200411dfc496d13c02d19d941018d0d26378888d8a325476"

RPROVIDES:${PN} += "act act(aarch-64)"
RDEPENDS:${PN} += "docker"

inherit rpm
