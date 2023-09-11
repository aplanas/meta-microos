SUMMARY = "Munin scripts"
DESCRIPTION = "Use this package to install munin scripts that allow to monitor some openQA \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693565748.f367431"

RPM_NAME = "openQA-munin-4.6.1693565748.f367431-1.1.aarch64.rpm"
RPM_HASH = "287035541690e70bef25ad3f7ac63b6ae95e6326f7bde6c096e3204a2de40269a09bc8b53fad3766a63355750fee8b9325af1ecc02d31c69287af6c03c443e70"

RPROVIDES:${PN} += "config-openQA-munin \
openQA-munin"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
munin \
munin-node \
perl"

inherit rpm
