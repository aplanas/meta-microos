SUMMARY = "Check keepalived"
DESCRIPTION = "This script either uses the 'notify' or snmp functionality of keepalived \
to inform an administrator about the current state of keepalived masters and \
slaves. \
 \
While the SNMP part is simply querying a SNMP server for the keepalived \
part (via agentx), the 'notify' part needs some adaptions in the keepalived.conf \
to: \
* execute a script on changes during keepalived runtime, which writes \
  the state change into a temporary file \
* read the file each time the monitoring server asks for the state if \
  there is a keepalived up and running"
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "monitoring-plugins-keepalived-0.1.5-1.11.noarch.rpm"
RPM_HASH = "994e7522430dc34195fcede4b46a7cabe412fd8859f91cb02cc5fc2879a9bba4571ff0843d386a9e572d4c7b153f10271d3443ea0a915c89630099ff15e4cbb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-keepalived \
monitoring-plugins-keepalived"

RDEPENDS:${PN} += "/bin/bash \
awk \
bash \
coreutils \
grep \
keepalived \
logrotate \
monitoring-plugins-common \
procps"

inherit rpm
