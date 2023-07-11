SUMMARY = "Performance Co-Pilot (PCP) Zeroconf Package"
DESCRIPTION = "This package contains configuration tweaks and files to increase metrics \
gathering frequency, several extended pmlogger configurations, as well as \
automated pmie diagnosis, alerting and self-healing for the localhost. \
A timer script also writes daily performance summary reports similar to \
those written by sysstat."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-zeroconf-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "8f552a3a5a02399f401cd6b4972a7207a1ad678d17acb88c4537c2bf6e30e697897c410ec0ab8c2b2cd7f1480c12f9173cb8877bf8feb3295c8c53d2534fcf4b"

RPROVIDES:${PN} += "config-pcp-zeroconf \
pcp-zeroconf"

RDEPENDS:${PN} += "/usr/bin/sh \
pcp \
pcp-doc \
pcp-pmda-dm \
pcp-pmda-nfsclient \
pcp-system-tools"

inherit rpm
