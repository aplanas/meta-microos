SUMMARY = "Tool for extracting metrics from application logs"
DESCRIPTION = "mtail is a tool for extracting metrics from application logs to be exported \
into a timeseries database or timeseries calculator for alerting and \
dashboarding."
LICENSE = "Apache-2.0"

PV = "3.0.0rc51"

RPM_NAME = "mtail-3.0.0rc51-1.5.aarch64.rpm"
RPM_HASH = "f925fc0430174de3b66bd58d345a1fd59a425eba642859cdb3c170016a0b3edf2b9065965cff196c624bf46761cd024c23cbe780680bedd5b16ba746d3e5f07a"

RPROVIDES:${PN} += "config-mtail \
mtail"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
shadow"

inherit rpm
