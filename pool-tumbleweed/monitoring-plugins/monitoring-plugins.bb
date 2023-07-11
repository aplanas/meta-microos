SUMMARY = "The Monitoring Plug-Ins"
DESCRIPTION = "The actual service checks on current monitoring solutions like Icinga, \
Nagios or Shinken (just to name a few) are performed by separate \
'plugin' programs which return the status of the checks to the \
running daemon. \
 \
This package contains those plugins."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "e9e0a129258b33c65ae57fdcbc244f8c39e3f928989cca329574176d05b0e00dfc349fd4a14d20b2f212294e3896fe6bb914cba5bb1ced76f4317438f88a8e91"

RPROVIDES:${PN} += "monitoring-plugins \
nagios-plugins"

RDEPENDS:${PN} += "permissions"

inherit rpm
