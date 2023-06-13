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

RPM_NAME = "monitoring-plugins-cluster-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "1404981fd0bf2cca953242a843e83e7ce425e7d706de883bae9dfbd40b1523960ddc774667f2ac2daaee21fb31d498ee48f5b35e42897557ef5cf8b37ac0e49d"

RPROVIDES:${PN} += "monitoring-plugins-cluster \
monitoring-plugins-cluster(aarch-64) \
nagios-plugins-cluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
