SUMMARY = "Web Console for Linux servers"
DESCRIPTION = "The Cockpit Web Console enables users to administer GNU/Linux servers using a \
web browser. \
 \
It offers network configuration, log inspection, diagnostic reports, SELinux \
troubleshooting, interactive command-line sessions, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-276.1-4.3.aarch64.rpm"
RPM_HASH = "7fc96f21ef278c7a45eb288294472a400c5373127b1f5eb1b5b9acb88355077e55aabcb0401d1a42faeb5e6d640799c74549a50a0d1739a75a9547e7c24c10e7"

RPROVIDES:${PN} += "cockpit cockpit(aarch-64) metainfo() metainfo(cockpit.appdata.xml)"
RDEPENDS:${PN} += "cockpit-bridge cockpit-system cockpit-ws"

inherit rpm
