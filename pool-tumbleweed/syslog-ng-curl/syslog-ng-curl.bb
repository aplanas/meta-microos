SUMMARY = "HTTP destination support for syslog-ng"
DESCRIPTION = "This package provides HTTP destination support for syslog-ng by means \
of libcurl."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-curl-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "7ab26aa827461f378227b2175874349ea188b74351022066590bb9b6f5ba2c178f07bb591cee9465d9ac817700ebdf17213ec6cef36a8d487d96d4d9cf4d08ac"

RPROVIDES:${PN} += "syslog-ng-curl \
syslog-ng-curl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libsyslog-ng-4.2.so.0()(64bit) \
syslog-ng"

inherit rpm
