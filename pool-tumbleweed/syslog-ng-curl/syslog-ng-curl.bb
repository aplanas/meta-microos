SUMMARY = "HTTP destination support for syslog-ng"
DESCRIPTION = "This package provides HTTP destination support for syslog-ng by means \
of libcurl."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-curl-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "c0bf419dc1585f74584f226d07ef3c1821c4480aa251cc5012ac83afe084f2678919816d21696573eeaf49a59e4dfb8d46e076c7df8f5325e73108f90f13f24e"

RPROVIDES:${PN} += "syslog-ng-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
