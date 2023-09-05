SUMMARY = "Web Console for Linux servers"
DESCRIPTION = "The Cockpit Web Console enables users to administer GNU/Linux servers using a \
web browser. \
 \
It offers network configuration, log inspection, diagnostic reports, SELinux \
troubleshooting, interactive command-line sessions, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-298-2.1.aarch64.rpm"
RPM_HASH = "ec4932fb4c76f5bed6b13290ce4d4347cb95d1f2960707fb475b9cf6b3f2a6eb5438465deb7954b8268d534941fc28b18ac76a5da0bfcff95f8b550b566c3094"

RPROVIDES:${PN} += "cockpit"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-system \
cockpit-ws"

inherit rpm
