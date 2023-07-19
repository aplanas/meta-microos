SUMMARY = "HTTP destination support for syslog-ng"
DESCRIPTION = "This package provides HTTP destination support for syslog-ng by means \
of libcurl."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-curl-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "1d394dab3281d5aa2150df63f8cbe9021fbbb83066b10831c0f1a3c1c5cd98e3cf7b64757bd4d564adacce8996031fdfb178da2650601e1379832bdc4981f136"

RPROVIDES:${PN} += "syslog-ng-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
