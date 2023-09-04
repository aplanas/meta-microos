SUMMARY = "Parse and format W3CDTF datetime strings"
DESCRIPTION = "This module understands the W3CDTF date/time format, an ISO 8601 profile, \
defined at http://www.w3.org/TR/NOTE-datetime. This format as the native \
date format of RSS 1.0. \
 \
It can be used to parse these formats in order to create the appropriate \
objects."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-DateTime-Format-W3CDTF-0.08-1.13.noarch.rpm"
RPM_HASH = "0aa1c5b5818535490f168138b65c93625d27ff538c5eb7e3c24087511537b471a271953fb1a32c22faa76db2f12a5916c5f5b05c7fc912f18322d4727a11c714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--W3CDTF \
perl-DateTime-Format-W3CDTF"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime"

inherit rpm
