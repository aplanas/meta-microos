SUMMARY = "Web Console for Linux servers"
DESCRIPTION = "The Cockpit Web Console enables users to administer GNU/Linux servers using a \
web browser. \
 \
It offers network configuration, log inspection, diagnostic reports, SELinux \
troubleshooting, interactive command-line sessions, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-300.1-1.1.aarch64.rpm"
RPM_HASH = "bbe04fc7aecc491852832bc8bab9c9bd29bc3b8e1d45f1794f5cdbd15507785f75c30d8bf2c9c96118f67aa8588f46923b20aacd20c9b7418a4e7749482fc20f"

RPROVIDES:${PN} += "cockpit"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-system \
cockpit-ws"

inherit rpm
