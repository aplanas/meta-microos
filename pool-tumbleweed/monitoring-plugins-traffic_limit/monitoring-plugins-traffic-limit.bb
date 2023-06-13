SUMMARY = "Checks the traffic on any interface"
DESCRIPTION = "check_traffic_limit is a Nagios plugin based on vnstat. It checks the traffic \
on any interface and sends a warning when defined daily or monthly limits are \
reached. The plugin comes with Nagios grapher templates. \
 \
Example: \
./check_traffic_limit -i eth0 -w 10000 -c 12000 -p d"
LICENSE = "BSD-4-Clause"

PV = "0.5"

RPM_NAME = "monitoring-plugins-traffic_limit-0.5-1.10.noarch.rpm"
RPM_HASH = "01b280a1cae0cb1ada033f0bce62aa8160b156961b0af723d79849c045c942fe4d1537cd1ccef0da81e60b31ea05b39206f37359747596b343e07fb337e92d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-traffic_limit \
nagios-plugins-traffic_limit"

RDEPENDS:${PN} += "/usr/bin/perl \
gawk \
grep \
perl(Monitoring::Plugin) \
vnstat"

inherit rpm
