SUMMARY = "Munin scripts"
DESCRIPTION = "Use this package to install munin scripts that allow to monitor some openQA \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-munin-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "32c4f08f296877017b1214ccad05495d059dfbdd586fd24cee0b2eb528992dd5c753762f454befa287d9cf0964bdcb75f11732d8ebd9d43efa71d836837c3c6b"

RPROVIDES:${PN} += "config-openQA-munin \
openQA-munin"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
munin \
munin-node \
perl"

inherit rpm
