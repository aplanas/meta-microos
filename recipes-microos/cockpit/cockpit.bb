SUMMARY = "Web Console for Linux servers"
DESCRIPTION = "The Cockpit Web Console enables users to administer GNU/Linux servers using a \
web browser. \
 \
It offers network configuration, log inspection, diagnostic reports, SELinux \
troubleshooting, interactive command-line sessions, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-276.1-4.4.aarch64.rpm"
RPM_HASH = "1dbea02cb82c94ab61730dd175f5283300787be10a8617924ee6a71553145d31ceda1bc5b4a865b7ee12b70fedd04ac1f8927682ef08f61839194d958259335d"

RPROVIDES:${PN} += "cockpit \
cockpit(aarch-64) \
metainfo() \
metainfo(cockpit.appdata.xml)"
RDEPENDS:${PN} += "cockpit-bridge \
cockpit-system \
cockpit-ws"

inherit rpm
