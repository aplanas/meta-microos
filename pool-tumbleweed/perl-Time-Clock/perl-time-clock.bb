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

RPM_NAME = "perl-Time-Clock-1.03-3.28.noarch.rpm"
RPM_HASH = "fa2ac46e1b4efe8bee5bc8a9e00121acf52057bb0b953001431df29a897d5e180891c964d8172a02d6513ceec158c6578ed2000ca7ad65e5accbdd93d4de15db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Clock \
perl-Time-Clock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
