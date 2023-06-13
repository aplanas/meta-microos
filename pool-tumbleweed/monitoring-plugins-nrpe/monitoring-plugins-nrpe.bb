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

RPM_NAME = "monitoring-plugins-nrpe-4.0.3-5.3.aarch64.rpm"
RPM_HASH = "7ccb5d1051807754177bbadb9c0360666e1121c53cbff98dd8f58fc51cac016a37f2f6e52d52027c066f41edda4a2910e2126a8e6884b44c18a7db44fa3e884c"

RPROVIDES:${PN} += "config(monitoring-plugins-nrpe) \
monitoring-plugins-nrpe \
monitoring-plugins-nrpe(aarch-64) \
nagios-nrpe-server \
nagios-plugins-nrpe"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
