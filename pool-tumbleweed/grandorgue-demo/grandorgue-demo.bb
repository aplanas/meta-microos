SUMMARY = "GrandOrgue demo sampleset"
DESCRIPTION = "This package contains the demo sampleset for GrandOrgue."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "grandorgue-demo-3.12.2-1.1.noarch.rpm"
RPM_HASH = "8df83199a0b0fa7659bfeb4f3bfa65da7e73955087edf86e2274a27da77086a9db2f2e167a3d0e53b0e1a371a4ecc36fafdd324248463b7e2d9ccb71db36f8e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grandorgue-demo"

RDEPENDS:${PN} += ""

inherit rpm
