SUMMARY = "Unit tests for cobbler"
DESCRIPTION = "Unit test files from the Cobbler project"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3.0+git.5c498dbf"

RPM_NAME = "cobbler-tests-3.3.3.0+git.5c498dbf-2.3.noarch.rpm"
RPM_HASH = "db41b9f07d952b3c2f5d34c320c3133485a126e38beb73ab302ffacc65ca6096da97ba60ad445d2c92dcd9d66bb59385406794ad73e5794ffcdbcd4d00395c54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler-tests"
RDEPENDS:${PN} += "cobbler"

inherit rpm
