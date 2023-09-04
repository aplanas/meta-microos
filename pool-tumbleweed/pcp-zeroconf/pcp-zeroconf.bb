SUMMARY = "Performance Co-Pilot (PCP) Zeroconf Package"
DESCRIPTION = "This package contains configuration tweaks and files to increase metrics \
gathering frequency, several extended pmlogger configurations, as well as \
automated pmie diagnosis, alerting and self-healing for the localhost. \
A timer script also writes daily performance summary reports similar to \
those written by sysstat."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-zeroconf-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "1ecc85f665906c70e70046ca761ea532ca292ce59100c1829a0a7538f4f84bff259947d85fd328cdcd7eff3c636b79ce03324589d5d91569a740aa795d204315"

RPROVIDES:${PN} += "config-pcp-zeroconf \
pcp-zeroconf"

RDEPENDS:${PN} += "/usr/bin/sh \
pcp \
pcp-doc \
pcp-pmda-dm \
pcp-pmda-nfsclient \
pcp-system-tools"

inherit rpm
