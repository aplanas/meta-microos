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

RPM_NAME = "perl-DateTime-1.59-1.2.aarch64.rpm"
RPM_HASH = "c4c103cf081c06897725c419383e2a35287cbfdaa0913719f3e2769ceaee400c2a53c92c943ab2e4c83f29615ff7b55bc4843ffbe3bd5c71c7a5eb477044cdee"

RPROVIDES:${PN} += "perl(DateTime) \
perl(DateTime::Duration) \
perl(DateTime::Helpers) \
perl(DateTime::Infinite) \
perl(DateTime::Infinite::Future) \
perl(DateTime::Infinite::Past) \
perl(DateTime::LeapSecond) \
perl(DateTime::PP) \
perl(DateTime::PPExtra) \
perl(DateTime::Types) \
perl-DateTime \
perl-DateTime(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DateTime::Locale) \
perl(DateTime::TimeZone) \
perl(Dist::CheckConflicts) \
perl(Params::ValidationCompiler) \
perl(Specio) \
perl(Specio::Declare) \
perl(Specio::Exporter) \
perl(Specio::Library::Builtins) \
perl(Specio::Library::Numeric) \
perl(Specio::Library::String) \
perl(Specio::Subs) \
perl(Try::Tiny) \
perl(namespace::autoclean) \
perl(parent)"

inherit rpm
