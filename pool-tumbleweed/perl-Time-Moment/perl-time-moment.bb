SUMMARY = "Represents a date and time of day with an offset from UTC"
DESCRIPTION = "'Time::Moment' is an immutable object representing a date and time of day \
with an offset from UTC in the ISO 8601 calendar system. \
 \
Time is measured in nanoseconds since '0001-01-01T00Z'. In 'Time:Moment' \
leap seconds are ignored. It is assumed that there are exactly \
'86,400,000,000,000' nanoseconds per day. 'Time::Moment' can represent all \
epoch integers from '-62,135,596,800' to '253,402,300,799'; this range \
suffices to measure times to nanosecond precision for any instant that is \
within '0001-01-01T00:00:00Z' to '9999-12-31T23:59:59Z'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.44"

RPM_NAME = "perl-Time-Moment-0.44-2.2.aarch64.rpm"
RPM_HASH = "25309b05e7d613157da7c84a3db3705ecd94a497f259a01796cc22dfad0511bcc62b723bc15cded3b144196610761a8f80e63a80ab5029ad61ac028384d79938"

RPROVIDES:${PN} += "perl(Time::Moment) \
perl(Time::Moment::Adjusters) \
perl-Time-Moment \
perl-Time-Moment(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
