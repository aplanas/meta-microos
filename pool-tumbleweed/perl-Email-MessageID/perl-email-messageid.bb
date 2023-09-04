SUMMARY = "Generate world unique message-ids"
DESCRIPTION = "Message-ids are optional, but highly recommended, headers that identify a \
message uniquely. This software generates a unique message-id."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.408"

RPM_NAME = "perl-Email-MessageID-1.408-1.4.noarch.rpm"
RPM_HASH = "65777fe0b406bf18c089c18d4c404c4f75d7d54f44a58a49e0747bc371b1648fe55349e085acd763fb78fa9a6b1b00c3720f157957034314d67943ff4da0e4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MessageID \
perl-Email-MessageID"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
