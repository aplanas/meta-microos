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

RPM_NAME = "perl-DateTime-Format-SQLite-0.11-3.27.noarch.rpm"
RPM_HASH = "e1e3606d1848342407c757fd365f45b025398610d7105a066c7f8b1b642b59c3b1253bfc870d8b691e98985398f3965752c2b6948c0d3aac76303416c80ce23c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--SQLite \
perl-DateTime-Format-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-DateTime--Format--Builder"

inherit rpm
