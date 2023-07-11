SUMMARY = "Test the HTTP service on the specified host"
DESCRIPTION = "This plugin tests the HTTP service on the specified host. It can test \
normal (http) and secure (https) servers, follow redirects, search for \
strings and regular expressions, check connection times, and report on \
certificate expiration times."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-http-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "5e5819826b8939b38dbfbfbe3474c96565968984115263412704e1d814298a65e5dd0b8c49934dc5c37774d59c95139849487bda2c609d8f4c3bef97f46b2551"

RPROVIDES:${PN} += "monitoring-plugins-http \
nagios-plugins-http"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
