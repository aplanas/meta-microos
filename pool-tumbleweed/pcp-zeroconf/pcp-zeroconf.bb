SUMMARY = "Performance Co-Pilot (PCP) Zeroconf Package"
DESCRIPTION = "This package contains configuration tweaks and files to increase metrics \
gathering frequency, several extended pmlogger configurations, as well as \
automated pmie diagnosis, alerting and self-healing for the localhost. \
A timer script also writes daily performance summary reports similar to \
those written by sysstat."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-zeroconf-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "62b8affa7f15551313be31e7b0514b5fe10e6f18001ef385c3975b632f8ed2d5219183a2a6bb60094a29300e30b031f3fd612ea2ee3a2811b6d06ccdd61d2ab7"

RPROVIDES:${PN} += "config(pcp-zeroconf) \
pcp-zeroconf \
pcp-zeroconf(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
pcp \
pcp-doc \
pcp-pmda-dm \
pcp-pmda-nfsclient \
pcp-system-tools"

inherit rpm
