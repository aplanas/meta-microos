SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "libmetrics-devel-1.1-5.7.aarch64.rpm"
RPM_HASH = "208619577f2e250b2049a4c53ee9912a4298a446429f2a50fb021a648ce87131dbbb595ba1967fd1b8eb13cf8ebeec12fc3a048fe56fbbe620824ce8534e76fb"

RPROVIDES:${PN} += "libmetrics-devel"

RDEPENDS:${PN} += "libmetrics0"

inherit rpm
