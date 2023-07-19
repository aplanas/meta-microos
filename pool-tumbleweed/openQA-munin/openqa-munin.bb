SUMMARY = "Munin scripts"
DESCRIPTION = "Use this package to install munin scripts that allow to monitor some openQA \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-munin-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "470fa55a75946dbeefc3187e5d1d43e569603f8324e2bf07727a78b24fbde942f589970fc0eedef916b73339a46ba6a3b42002af1ba4b97fd9ff67469a84f594"

RPROVIDES:${PN} += "config-openQA-munin \
openQA-munin"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
munin \
munin-node \
perl"

inherit rpm
