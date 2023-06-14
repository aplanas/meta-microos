SUMMARY = "Small dictionary for cracklib, a password checking library"
DESCRIPTION = "CrackLib tests passwords to determine whether they match certain \
security-oriented characteristics. You can use CrackLib to stop users \
from choosing passwords that are easy to guess. \
 \
This package contains a small dictionay file used by cracklib."
LICENSE = "LGPL-2.1-only"

PV = "2.9.8"

RPM_NAME = "cracklib-dict-small-2.9.8-1.2.aarch64.rpm"
RPM_HASH = "5b56e843793d4bb76150e0bb290c25d28f0ecbfba28585487de165e93b62ff48de8a29c54bf0ced790976fcc6e811cec4dbc1e3b2a2b820d0eb6c09b8e2222d9"

RPROVIDES:${PN} += "cracklib-dict \
cracklib-dict-small"

RDEPENDS:${PN} += ""

inherit rpm
