SUMMARY = "Munin scripts"
DESCRIPTION = "Use this package to install munin scripts that allow to monitor some openQA \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-munin-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "8cc88909503c7233f5194d6ed8e55a7ebe5b4fb756eeffc8a43e61a6acdd340e659705f5389db1c2a763677802bd3130710c754dd997af8dff164a9c41f90706"

RPROVIDES:${PN} += "config-openQA-munin \
openQA-munin"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
munin \
munin-node \
perl"

inherit rpm
