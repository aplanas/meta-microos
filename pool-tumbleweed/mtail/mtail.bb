SUMMARY = "Tool for extracting metrics from application logs"
DESCRIPTION = "mtail is a tool for extracting metrics from application logs to be exported \
into a timeseries database or timeseries calculator for alerting and \
dashboarding."
LICENSE = "Apache-2.0"

PV = "3.0.0rc51"

RPM_NAME = "mtail-3.0.0rc51-1.4.aarch64.rpm"
RPM_HASH = "808eb41debdd508083fc6816f62ee3385ba2577b945b65f833b8b7711cdedb04363ff3bb966be2dec1aa99cc2792aaa29ac36933ac4e13b08173042664b18801"

RPROVIDES:${PN} += "config-mtail \
mtail"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
shadow"

inherit rpm
