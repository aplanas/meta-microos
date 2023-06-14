SUMMARY = "Produce RFC 2822 date strings"
DESCRIPTION = "This module provides a simple means for generating an RFC 2822 compliant \
datetime string. (In case you care, they're not RFC 822 dates, because they \
use a four digit year, which is not allowed in RFC 822.)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.008"

RPM_NAME = "perl-Email-Date-Format-1.008-1.1.noarch.rpm"
RPM_HASH = "0dc2cb09f4aad33dc3853002ff90ae9d94d43870c5913117d781e58c9ea25fa46a67f253607e30b2d3c775b9196520364deb2c815d1754f6d16c5da42335db7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Date--Format \
perl-Email-Date-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Time--Local"

inherit rpm
