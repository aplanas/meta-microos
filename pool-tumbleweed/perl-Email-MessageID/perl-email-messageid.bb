SUMMARY = "Generate world unique message-ids"
DESCRIPTION = "Message-ids are optional, but highly recommended, headers that identify a \
message uniquely. This software generates a unique message-id."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.408"

RPM_NAME = "perl-Email-MessageID-1.408-1.2.noarch.rpm"
RPM_HASH = "fcde089cc0ab469e026ee4318010a50ede3a858e3cb951256d0ac874a9c1c22e12ada907793fd05e7fa5adbb19c2ecfa4800643ee672739dcf44ef5f78c215f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MessageID \
perl-Email-MessageID"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
