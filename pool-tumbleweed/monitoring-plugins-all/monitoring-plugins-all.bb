SUMMARY = "All Monitoring-Plugin checks"
DESCRIPTION = "This virtual package recommends all currently available, official \
Monitoring plugins and additional packages that are available in \
https://build.opensuse.org/project/show/server:monitoring"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-all-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "75c6399750a04d4d5bcced21815b8ece3f9c9da643077f51ae034c3a4a8e7a17684206c9b7258632cee1dc3b0f1669f10ef2ceee83bbdffe7a9c6076f5889d5f"

RPROVIDES:${PN} += "monitoring-plugins-all \
nagios-plugins-all"

RDEPENDS:${PN} += ""

inherit rpm
