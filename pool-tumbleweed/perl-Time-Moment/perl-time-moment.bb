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

RPM_NAME = "perl-Time-Moment-0.44-2.3.aarch64.rpm"
RPM_HASH = "48eddd36e7062388a0cc8b1e4c489242969b075beabf3a5988b668de96a557e52748ea432c762604bc1a20a6f51a27ece7bad47a023e54da9550d2977d002be0"

RPROVIDES:${PN} += "perl-Time--Moment \
perl-Time--Moment--Adjusters \
perl-Time-Moment"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
