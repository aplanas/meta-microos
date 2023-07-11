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

RPM_NAME = "perl-DateTime-1.59-1.3.aarch64.rpm"
RPM_HASH = "843fe299a2c41b3f9f60f7b3ce579f2825c065fe518d2f127735af0b3106ef5659165a959562b3d9097265718b00bece9b5308483b23a0a14a9874cf0af6171e"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
