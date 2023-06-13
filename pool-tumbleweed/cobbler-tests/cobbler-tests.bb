SUMMARY = "Unit tests for cobbler"
DESCRIPTION = "Unit test files from the Cobbler project"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "cobbler-tests-3.3.3-1.1.noarch.rpm"
RPM_HASH = "f60b7fa45d8c6b95f0c3e8549eb326272f7ffa31332fd85fb76dc56eb677bab37b44390f47d597095bdb7c91968553cb3aa62bddce2da2098eb935d52c030c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler-tests"

RDEPENDS:${PN} += "cobbler"

inherit rpm
