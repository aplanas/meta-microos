SUMMARY = "[validation] extra for python311-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [validation] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python311-pytoolconfig-validation-1.2.4-1.6.noarch.rpm"
RPM_HASH = "6851b55fc4a40099b16dbc8f489d2dd14000c772869d15cebed7bc489f30218b3bc6aa4b0aa9e2f148f8082692c9c3873370b27175a31ed66527709aae66824d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoolconfig-validation \
python311-pytoolconfig-validation"

RDEPENDS:${PN} += "python311-pydantic \
python311-pytoolconfig"

inherit rpm
