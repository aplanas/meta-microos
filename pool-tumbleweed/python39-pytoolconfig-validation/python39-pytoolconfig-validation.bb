SUMMARY = "[validation] extra for python39-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [validation] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python39-pytoolconfig-validation-1.2.4-1.6.noarch.rpm"
RPM_HASH = "3f5976e6b84e98af82d3b78c54da628d6cb9fd4075568f7b124a9de0db98367d47e8eba1b25bc0c05961623c4c52c5fde682637db28662461a31e0c109f751ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytoolconfig-validation"

RDEPENDS:${PN} += "python39-pydantic \
python39-pytoolconfig"

inherit rpm
