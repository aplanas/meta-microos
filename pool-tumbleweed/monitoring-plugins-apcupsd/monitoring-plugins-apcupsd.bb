SUMMARY = "Monitoring plugin for APC Smart-UPSes using apcupsd"
DESCRIPTION = "Nagios plugin to monitor APC Smart-UPSes using apcupsd."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "monitoring-plugins-apcupsd-1.3-2.10.noarch.rpm"
RPM_HASH = "499af11b7bb4dcf9ac76a76d0176bd83f6fb4db91d40014b2cf901cbb286599c68338fd388855898aefbdbc52ad1fd38545194a7de6c96bc10769b0e1a26ce16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-apcupsd \
nagios-plugins-apcupsd"
RDEPENDS:${PN} += "/bin/sh \
apcupsd \
bash \
grep"

inherit rpm
