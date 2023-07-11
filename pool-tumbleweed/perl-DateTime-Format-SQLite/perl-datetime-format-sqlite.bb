SUMMARY = "Parse and format SQLite dates and times"
DESCRIPTION = "This module understands the formats used by SQLite for its 'date', \
'datetime' and 'time' functions. It can be used to parse these formats in \
order to create the DateTime manpage objects, and it can take a DateTime \
object and produce a timestring accepted by SQLite. \
 \
*NOTE:* SQLite does not have real date/time types but stores everything as \
strings. This module deals with the date/time strings as \
understood/returned by SQLite's 'date', 'time', 'datetime', 'julianday' and \
'strftime' SQL functions. You will usually want to store your dates in one \
of these formats."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-DateTime-Format-SQLite-0.11-3.26.noarch.rpm"
RPM_HASH = "b20d987fd95a6f516169fe185262516ef4fa96cfefb958ea5f09596cedd0efe8cf7a5b4e1d879763a6d867421bc75715a65812f576c165e5a812bc0df5d45837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--SQLite \
perl-DateTime-Format-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime \
perl-DateTime--Format--Builder"

inherit rpm
