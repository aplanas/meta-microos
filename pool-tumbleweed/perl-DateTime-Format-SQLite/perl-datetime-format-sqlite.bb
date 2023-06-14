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

RPM_NAME = "perl-DateTime-Format-SQLite-0.11-3.25.noarch.rpm"
RPM_HASH = "deb31314ca2b141edcbb45c8ea85d8ad61a526a097b23c079a0e3a4fdbb85be1ef9f64bf77011edf4128872faa4456627427c1a739e21d67b61ed454f2a6b453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--SQLite \
perl-DateTime-Format-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-DateTime \
perl-DateTime--Format--Builder"

inherit rpm
