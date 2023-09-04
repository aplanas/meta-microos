SUMMARY = "Produce RFC 2822 date strings"
DESCRIPTION = "This module provides a simple means for generating an RFC 2822 compliant \
datetime string. (In case you care, they're not RFC 822 dates, because they \
use a four digit year, which is not allowed in RFC 822.)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.008"

RPM_NAME = "perl-Email-Date-Format-1.008-1.3.noarch.rpm"
RPM_HASH = "0dc9d0a0cbeac4f85aa053e0f7efd497a15975467f01c3eb0a3d950fd0841220ffb26e16af8550de73dea2201163e65ff954338be122887e94fc1901ca858369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Date--Format \
perl-Email-Date-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Time--Local"

inherit rpm
