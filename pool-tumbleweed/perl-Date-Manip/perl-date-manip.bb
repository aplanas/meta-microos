SUMMARY = "Date manipulation routines"
DESCRIPTION = "Date::Manip is a series of modules designed to make any common date/time \
operation easy to do. Operations such as comparing two times, determining a \
date a given amount of time from another, or parsing international times \
are all easily done. It deals with time as it is used in the Gregorian \
calendar (the one currently in use) with full support for time changes due \
to daylight saving time. \
 \
From the very beginning, the main focus of Date::Manip has been to be able \
to do ANY desired date/time operation easily. Many other modules exist \
which may do a subset of these operations quicker or more efficiently, but \
no other module can do all of the operations available in Date::Manip. \
 \
Date::Manip has functionality to work with several fundamental types of \
data. \
 \
* *dates* \
 \
The word date is used extensively here and is somewhat misleading. In \
Date::Manip, a date consists of three pieces of information: a calendar \
date (year, month, day), a time of day (hour, minute, second), and time \
zone information. Calendar dates and times are fully handled. Time zones \
are handled as well, but depending on how you use Date::Manip, there may be \
some limitations as discussed below. \
 \
* *delta* \
 \
A delta is an amount of time (i.e. the amount of time between two different \
dates). Think of it as the duration of an event or the amount of time \
between two dates. \
 \
A delta refers only to an amount of time. It includes no information about \
a starting or ending date/time. Most people will think of a delta as an \
amount of time, but the term 'time' is already used so much in this module \
that I didn't want to use it here in order to avoid confusion. \
 \
* *recurrence* \
 \
A recurring event is something which occurs on a regular recurring basis. \
 \
* *holidays* and *events* \
 \
Holidays and events are basically named dates or recurrences. \
 \
Among other things, Date::Manip allow you to: \
 \
* *** \
 \
Enter a date in practically any format you choose. \
 \
* *** \
 \
Compare two dates, entered in widely different formats to determine which \
is earlier. \
 \
* *** \
 \
Extract any information you want from a date using a format string similar \
to the Unix date command. \
 \
* *** \
 \
Determine the amount of time between two dates, or add an amount of time (a \
delta) to a date to get a second date. \
 \
* *** \
 \
Work with dates using international formats (foreign month names, 12/10/95 \
referring to October rather than December, etc.). \
 \
* *** \
 \
Convert dates from one timezone to another. \
 \
* *** \
 \
To find a list of dates where a recurring event happens. \
 \
Each of these tasks is trivial (one or two lines at most) with this \
package."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.91"

RPM_NAME = "perl-Date-Manip-6.91-1.1.noarch.rpm"
RPM_HASH = "75062a5c5bfe07814430d339fe67ac6c8027d3ac2ecb0bdf9339946ec84d6bd13dd9cf6059c2cd8b2508277127456e347ec5348c7c1281e4ef519fba822b4aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Date::Manip) \
perl(Date::Manip::Base) \
perl(Date::Manip::DM5) \
perl(Date::Manip::DM5abbrevs) \
perl(Date::Manip::DM6) \
perl(Date::Manip::Date) \
perl(Date::Manip::Delta) \
perl(Date::Manip::Lang::catalan) \
perl(Date::Manip::Lang::danish) \
perl(Date::Manip::Lang::dutch) \
perl(Date::Manip::Lang::english) \
perl(Date::Manip::Lang::finnish) \
perl(Date::Manip::Lang::french) \
perl(Date::Manip::Lang::german) \
perl(Date::Manip::Lang::index) \
perl(Date::Manip::Lang::italian) \
perl(Date::Manip::Lang::norwegian) \
perl(Date::Manip::Lang::polish) \
perl(Date::Manip::Lang::portugue) \
perl(Date::Manip::Lang::romanian) \
perl(Date::Manip::Lang::russian) \
perl(Date::Manip::Lang::spanish) \
perl(Date::Manip::Lang::swedish) \
perl(Date::Manip::Lang::turkish) \
perl(Date::Manip::Obj) \
perl(Date::Manip::Recur) \
perl(Date::Manip::TZ) \
perl(Date::Manip::TZ_Base) \
perl(Date::Manip::TZdata) \
perl(Date::Manip::Zones) \
perl-Date-Manip"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
