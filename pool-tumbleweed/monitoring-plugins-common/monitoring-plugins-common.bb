SUMMARY = "Libraries for Nagios plugins"
DESCRIPTION = "This package includes the libraries (scripts) that are included by many \
of the standard checks."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-common-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "0627d22c8dbec1a5889bc56dcc48738f3881ae9922d88faab19b8442af8e80c10ef1ebc1e8a97a9a58e16416b92a471f687bfbe0e6874e21931a6cd47744ea4b"

RPROVIDES:${PN} += "config-monitoring-plugins-common \
monitoring-plugins-common \
nagios-plugins-common \
perl-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
