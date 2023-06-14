SUMMARY = "EDID and DisplayID library"
DESCRIPTION = "libdisplay-info is an EDID and DisplayID library. It provides a \
low-level API exposing all of the details of these formats, plus a \
high-level API (of opinionated functions) which abstracts these \
details for common operations."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdisplay-info1-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "5853bd5ff311f003a2b88fe7cceb30e5275b721bd73348a75637febf57b76de76125caaa5afed85628bfe78ff95b483dda3f3fa7787dcaccd4fe6fa3a9ff00e3"

RPROVIDES:${PN} += "libdisplay-info.so.1 \
libdisplay-info1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
