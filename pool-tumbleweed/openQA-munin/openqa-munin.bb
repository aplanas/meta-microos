SUMMARY = "Munin scripts"
DESCRIPTION = "Use this package to install munin scripts that allow to monitor some openQA \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688565452.efc15ea"

RPM_NAME = "openQA-munin-4.6.1688565452.efc15ea-1.1.aarch64.rpm"
RPM_HASH = "118513f21083ec339c80e3db1ca2316b678d0b1cf76a8cc37b0d198f2cdc3c2c1be0310bc0a2667a3ce7d92c2af30124896291fb851811a4a2716741156b44a2"

RPROVIDES:${PN} += "config-openQA-munin \
openQA-munin"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
munin \
munin-node \
perl"

inherit rpm
