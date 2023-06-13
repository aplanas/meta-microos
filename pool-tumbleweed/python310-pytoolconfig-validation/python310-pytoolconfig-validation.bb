SUMMARY = "[validation] extra for python310-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [validation] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python310-pytoolconfig-validation-1.2.4-1.4.noarch.rpm"
RPM_HASH = "e7a7663386aa6fadd74c54aab4e5b0b98f929314bcbf869ebdb146bf37a41c141a8d28818008cac3eaee0235dc752ab850c213f04d8db9f8a6421c9294e49b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoolconfig-validation \
python310-pytoolconfig-validation"

RDEPENDS:${PN} += "python310-pydantic \
python310-pytoolconfig"

inherit rpm
