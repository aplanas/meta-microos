SUMMARY = "Web Console for Linux servers"
DESCRIPTION = "The Cockpit Web Console enables users to administer GNU/Linux servers using a \
web browser. \
 \
It offers network configuration, log inspection, diagnostic reports, SELinux \
troubleshooting, interactive command-line sessions, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-298-1.1.aarch64.rpm"
RPM_HASH = "7dfa72769b6440fb1efadd8b92bc55a281a510eed12bfa61b023527b38ba358075138de5d6855619fa35c29204793ec71cd9d7db9aba5e7691b46c49a5eee537"

RPROVIDES:${PN} += "cockpit"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-system \
cockpit-ws"

inherit rpm
