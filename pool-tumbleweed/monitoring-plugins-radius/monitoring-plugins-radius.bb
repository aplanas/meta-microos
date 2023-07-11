SUMMARY = "Test RADIUS server"
DESCRIPTION = "This plugin tests a RADIUS server to see if it is accepting connections.  The \
server to test must be specified in the invocation, as well as a user name and \
password. A configuration file may also be present. The format of the \
configuration file is described in the radiusclient library sources.  The \
password option presents a substantial security issue because the password can \
possibly be determined by careful watching of the command line in a process \
listing. This risk is exacerbated because nagios will run the plugin at regular \
predictable intervals. Please be sure that the password used does not allow \
access to sensitive system resources."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-radius-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "32188e509f9c874f5b09cd7cddb5ea6143a4c3c6de2ce24e926c2913c7c12d91235445bac93ac0ea0c67167380a857f6f5f767717cc22293024a1de4bb4bbee9"

RPROVIDES:${PN} += "monitoring-plugins-radius \
nagios-plugins-radius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeradius-client.so.2"

inherit rpm
