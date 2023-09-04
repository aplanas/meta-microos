SUMMARY = "Redis protocol parser/encoder with asynchronous capabilities"
DESCRIPTION = "Redis protocol parser/encoder with asynchronous capabilities and at \
http://redis.io/topics/pipelining support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0011"

RPM_NAME = "perl-Protocol-Redis-1.0011-1.16.noarch.rpm"
RPM_HASH = "2d892d5b0b9d56a5137a0949c75f9090ca7344640a62ddaeb84a851be20cc1f33ceefce6bed0125385603244337378891f483fb0bdd042452669a8ae0388c1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--Redis \
perl-Protocol--Redis--Test \
perl-Protocol-Redis"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.38.0 \
perl-Test--More"

inherit rpm
