SUMMARY = "Date and time object for Perl"
DESCRIPTION = "DateTime is a class for the representation of date/time combinations, and \
is part of the Perl DateTime project. \
 \
It represents the Gregorian calendar, extended backwards in time before its \
creation (in 1582). This is sometimes known as the 'proleptic Gregorian \
calendar'. In this calendar, the first day of the calendar (the epoch), is \
the first day of year 1, which corresponds to the date which was \
(incorrectly) believed to be the birth of Jesus Christ. \
 \
The calendar represented does have a year 0, and in that way differs from \
how dates are often written using 'BCE/CE' or 'BC/AD'. \
 \
For infinite datetimes, please see the DateTime::Infinite module."
LICENSE = "Artistic-2.0"

PV = "1.59"

RPM_NAME = "perl-DateTime-1.59-1.4.aarch64.rpm"
RPM_HASH = "c50f7523c5e7e88db9b278e5e4ad80bc4574ee9eb4bfffb79f5544e5699e8aa6b8792b150ac9172cfaa22077f2f37749ec4645cec1687d3911de3a08a0af01a8"

RPROVIDES:${PN} += "perl-DateTime \
perl-DateTime--Duration \
perl-DateTime--Helpers \
perl-DateTime--Infinite \
perl-DateTime--Infinite--Future \
perl-DateTime--Infinite--Past \
perl-DateTime--LeapSecond \
perl-DateTime--PP \
perl-DateTime--PPExtra \
perl-DateTime--Types"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime--Locale \
perl-DateTime--TimeZone \
perl-Dist--CheckConflicts \
perl-Params--ValidationCompiler \
perl-Specio \
perl-Specio--Declare \
perl-Specio--Exporter \
perl-Specio--Library--Builtins \
perl-Specio--Library--Numeric \
perl-Specio--Library--String \
perl-Specio--Subs \
perl-Try--Tiny \
perl-namespace--autoclean \
perl-parent"

inherit rpm
