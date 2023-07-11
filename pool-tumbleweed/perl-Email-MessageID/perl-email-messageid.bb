SUMMARY = "Generate world unique message-ids"
DESCRIPTION = "Message-ids are optional, but highly recommended, headers that identify a \
message uniquely. This software generates a unique message-id."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.408"

RPM_NAME = "perl-Email-MessageID-1.408-1.3.noarch.rpm"
RPM_HASH = "ce46d7e00f9716ead67becac1d53a8df23e361e9ee910a6b1f348c240ef3f48029ff3e4ae3647b1118ec78a58a214d742c4b5d7ab5901ccdfff5bcd89c52d017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MessageID \
perl-Email-MessageID"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
