SUMMARY = "Twenty-four hour clock object with nanosecond precision."
DESCRIPTION = "A the Time::Clock manpage object is a twenty-four hour clock with \
nanosecond precision and wrap-around. It is a clock only; it has absolutely \
no concept of dates. Vagaries of date/time such as leap seconds and \
daylight savings time are unsupported. \
 \
When a the Time::Clock manpage object hits 23:59:59.999999999 and at least \
one more nanosecond is added, it will wrap around to 00:00:00.000000000. \
This works in reverse when time is subtracted. \
 \
the Time::Clock manpage objects automatically stringify to a user-definable \
format."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.03"

RPM_NAME = "perl-Time-Clock-1.03-3.26.noarch.rpm"
RPM_HASH = "d811b6ac375ffb5644c3668bc474e456fdfebbf6a27dc64428f5684163f56a25718a14ed0a462bfa4c23f4d8e11f38c24aff20e7557c6282c03486e16bf99583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Time::Clock) \
perl-Time-Clock"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
