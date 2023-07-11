SUMMARY = "Produce RFC 2822 date strings"
DESCRIPTION = "This module provides a simple means for generating an RFC 2822 compliant \
datetime string. (In case you care, they're not RFC 822 dates, because they \
use a four digit year, which is not allowed in RFC 822.)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.008"

RPM_NAME = "perl-Email-Date-Format-1.008-1.2.noarch.rpm"
RPM_HASH = "560950d86a6bcf7a0da33a498365e9a1312ca180c1236732fafb2db17781b53ae854d3f903bae9d6f0eaedb83f31e04b111c355ccbfedd119cf824f6910e4fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Date--Format \
perl-Email-Date-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Time--Local"

inherit rpm
