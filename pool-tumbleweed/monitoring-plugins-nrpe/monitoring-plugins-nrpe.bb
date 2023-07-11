SUMMARY = "NRPE plugin"
DESCRIPTION = "This package contains the plugin for the host runing the Nagios \
daemon. \
 \
It is used to contact the NRPE process on remote hosts. The plugin \
requests that a plugin be executed on the remote host and wait for the \
NRPE process to execute the plugin and return the result. \
 \
The plugin then uses the output and return code from the plugin \
execution on the remote host for its own output and return code."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.3"

RPM_NAME = "monitoring-plugins-nrpe-4.0.3-5.5.aarch64.rpm"
RPM_HASH = "5791ac926adba170219d06ee0baa848926fa80af4788e64d70ca9399278a6012180a9763b4e7fdd6119e96466e2e882ddf235c855a6850325b198f8bd994b33f"

RPROVIDES:${PN} += "config-monitoring-plugins-nrpe \
monitoring-plugins-nrpe \
nagios-nrpe-server \
nagios-plugins-nrpe"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
