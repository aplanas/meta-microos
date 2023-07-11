SUMMARY = "Host/Service Cluster Plugin"
DESCRIPTION = "Provides the check_cluster plugin to check Services and/or Hosts running \
as a cluster. \
 \
Example: \
  check_cluster -s -d 2,0,2,0 -c @3: \
Will alert critical if there are 3 or more service data points in a non-OK \
state."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-cluster-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "cf6996c6ba925cfd0c50be4e45e1dd803decbd6e075dd4f4e3b73c74fee6b1b65deba88738a721c36d57e1c74aba0aed0ce464d3895f94188aa63ed37451cc4b"

RPROVIDES:${PN} += "monitoring-plugins-cluster \
nagios-plugins-cluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
