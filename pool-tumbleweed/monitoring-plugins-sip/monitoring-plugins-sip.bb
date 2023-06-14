SUMMARY = "Test a SIP server/device for availability and response time"
DESCRIPTION = "Test SIP servers. \
 \
check_sip requires the following variable: \
  -u  Full SIP uri, eg sip:uri@example.com \
 \
The following optional variables are also available: \
  -f From SIP uri \
  -H Host to connect to \
  -p Port to connect to \
  -w Seconds after which to respond with a warning \
  -s Switch off standard behavior: after this, all SIP-responses are counted \
      as success"
LICENSE = "GPL-2.0+"

PV = "1.3"

RPM_NAME = "monitoring-plugins-sip-1.3-100.16.noarch.rpm"
RPM_HASH = "2a2f5fb8e84c54dbf8852a2e65c9788c731a23995d0fa3b1ccc4a76984aa14071fafb89c38046412f212f079228f8af5cd319bd56bf232b0250a0945212f614b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-sip \
nagios-plugins-sip"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-IO--Socket--INET \
perl-Net--Domain \
perl-Switch \
perl-Time--HiRes"

inherit rpm
