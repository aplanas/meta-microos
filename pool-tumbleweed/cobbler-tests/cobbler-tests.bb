SUMMARY = "Unit tests for cobbler"
DESCRIPTION = "Unit test files from the Cobbler project"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "cobbler-tests-3.3.3-1.2.noarch.rpm"
RPM_HASH = "724f1c3b3a5408a869f07c9bc56a41380017e8111caea54bd305e73f89b49a1ac8f5e73fab6123393c6d97dbcf365ffff4bf86abc905aa75a4fda7528cf43c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler-tests"

RDEPENDS:${PN} += "cobbler"

inherit rpm
