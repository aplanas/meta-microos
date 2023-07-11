SUMMARY = "a simple date object"
DESCRIPTION = "Dates are complex enough without times and timezones. This module may be \
used to create simple date objects. It handles: \
 \
* Validation. \
 \
  Reject 1999-02-29 but accept 2000-02-29. \
 \
* Interval arithmetic. \
 \
  How many days were between two given dates? What date comes N days after \
  today? \
 \
* Day-of-week calculation. \
 \
  What day of the week is a given date? \
 \
* Transparent date formatting. \
 \
  How should a date object be formatted. \
 \
It does *not* deal with hours, minutes, seconds, and time zones. \
 \
A date is uniquely identified by year, month, and day integers within valid \
ranges. This module will not allow the creation of objects for invalid \
dates. Attempting to create an invalid date will return undef. Month \
numbering starts at 1 for January, unlike in C and Java. Years are 4-digit. \
 \
Gregorian dates up to year 9999 are handled correctly, but we rely on \
Perl's builtin 'localtime' function when the current date is requested. On \
some platforms, 'localtime' may be vulnerable to rollovers such as the Unix \
'time_t' wraparound of 18 January 2038. \
 \
Overloading is used so you can compare or subtract two dates using standard \
numeric operators such as '==', and the sum of a date object and an integer \
is another date object. \
 \
Date::Simple objects are immutable. After assigning '$date1' to '$date2', \
no change to '$date1' can affect '$date2'. This means, for example, that \
there is nothing like a 'set_year' operation, and '$date++' assigns a new \
object to '$date'. \
 \
This module contains various undocumented functions. They may not be \
available on all platforms and are likely to change or disappear in future \
releases. Please let the author know if you think any of them should be \
public."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "3.03"

RPM_NAME = "perl-Date-Simple-3.03-9.38.aarch64.rpm"
RPM_HASH = "160d556a1f96ef97cb826cfd3a2bbdee41584678989b0ee56e03bf4098093af03c55c7ba348c0d0f1c9e47339695423ad3277bfe71ee28df78ed2368c35ab0b9"

RPROVIDES:${PN} += "perl-Date--Simple \
perl-Date--Simple--D8 \
perl-Date--Simple--Fmt \
perl-Date--Simple--ISO \
perl-Date-Simple"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Scalar--Util \
perl-Test--More"

inherit rpm
