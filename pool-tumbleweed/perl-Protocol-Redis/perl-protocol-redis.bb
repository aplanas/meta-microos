SUMMARY = "Redis protocol parser/encoder with asynchronous capabilities"
DESCRIPTION = "Redis protocol parser/encoder with asynchronous capabilities and at \
http://redis.io/topics/pipelining support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0011"

RPM_NAME = "perl-Protocol-Redis-1.0011-1.14.noarch.rpm"
RPM_HASH = "4113d2b713c22b546455e387fbbd05c1a9a4a38f689614c3f84fe261231e912bbb8dc9b79766add309b0903820834d376f27c14a45db188b1efc041ebebbe139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--Redis \
perl-Protocol--Redis--Test \
perl-Protocol-Redis"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.36.0 \
perl-Test--More"

inherit rpm
