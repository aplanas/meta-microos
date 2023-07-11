SUMMARY = "Web Console for Linux servers"
DESCRIPTION = "The Cockpit Web Console enables users to administer GNU/Linux servers using a \
web browser. \
 \
It offers network configuration, log inspection, diagnostic reports, SELinux \
troubleshooting, interactive command-line sessions, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-293-1.1.aarch64.rpm"
RPM_HASH = "b7690a3591a394b228d177489eae41be972a378c6614c8f3a942e65d1da935b591a779574c3294889accfd146408198e7d3b9ab285d5773e9eae9d4f519841f4"

RPROVIDES:${PN} += "cockpit"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-system \
cockpit-ws"

inherit rpm
