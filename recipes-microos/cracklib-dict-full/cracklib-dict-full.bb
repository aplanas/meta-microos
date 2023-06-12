SUMMARY = "A Password-Checking Library"
DESCRIPTION = "CrackLib tests passwords to determine whether they match certain \
security-oriented characteristics. You can use CrackLib to stop users \
from choosing passwords that are easy to guess."
LICENSE = "LGPL-2.1-only"

PV = "2.8.12"

RPM_NAME = "cracklib-dict-full-2.8.12-66.11.aarch64.rpm"
RPM_HASH = "fd9c508e9664bd5146d8121bfc4973b36826c437aeacf67a5ee8791aa6e98ccd18778631d4193a55dd92125c46a1b41e55c02537b703e9e2152abe5bf8afeab3"

RPROVIDES:${PN} += "cracklib-dict \
cracklib-dict-full \
cracklib-dict-full(aarch-64) \
cracklib:/usr/share/cracklib/pw_dict.pwd"
RDEPENDS:${PN} += ""

inherit rpm
