SUMMARY = "Redis protocol parser/encoder with asynchronous capabilities"
DESCRIPTION = "Redis protocol parser/encoder with asynchronous capabilities and at \
http://redis.io/topics/pipelining support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0011"

RPM_NAME = "perl-Protocol-Redis-1.0011-1.15.noarch.rpm"
RPM_HASH = "0d68bdefe5145fffd7d4fa1b8dcca7667f142b6d8fc8616c98395e1797a57cffc04f71f5089b28fddd57364ae0b4c00e7a6ed4878ca92a894716c678afe66b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--Redis \
perl-Protocol--Redis--Test \
perl-Protocol-Redis"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.36.1 \
perl-Test--More"

inherit rpm
