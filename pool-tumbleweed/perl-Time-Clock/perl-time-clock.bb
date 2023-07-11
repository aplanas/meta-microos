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

RPM_NAME = "perl-Time-Clock-1.03-3.27.noarch.rpm"
RPM_HASH = "2b5ce7130216ced2c7f82312549e549847f251abf5e9bc85993a07e572d18c5d82489ccffb1964ffb06cac755a262ab9cdb87b4fa83ae4febb21d4cec24c601a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Clock \
perl-Time-Clock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
