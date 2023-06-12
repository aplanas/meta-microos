SUMMARY = "[validation] extra for python39-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [validation] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python39-pytoolconfig-validation-1.2.4-1.4.noarch.rpm"
RPM_HASH = "6d90e048756490be3543e7496b6d4eb32af955a76be439504abbd68954ebed2138eedc25fc04f0256636259400381e029c514ac1b2f63752890ec17ed3b9d800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytoolconfig-validation"
RDEPENDS:${PN} += "python39-pydantic \
python39-pytoolconfig"

inherit rpm
