SUMMARY = "Check SSH service"
DESCRIPTION = "Try to connect to an SSH server at specified server and port."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ssh-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "3e60f13f275bb20acbf8da4237ca169c19254d7cb97e19d8687afea8e9b0d2462d485b7bdc213a604e93e60847372ced68fd40ddad933f8a2948ca82f031ad0c"

RPROVIDES:${PN} += "config-monitoring-plugins-ssh \
monitoring-plugins-ssh \
nagios-plugins-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
