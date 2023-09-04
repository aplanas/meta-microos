SUMMARY = "Munin scripts"
DESCRIPTION = "Use this package to install munin scripts that allow to monitor some openQA \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-munin-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "b8da1e4959a63256033e8476e21486b738e12fcda7b19dcdab4928d1802c9fe883f16bf323e795a78dd5e3dfa435fba16684ce054952315f43c592c4e54b5d03"

RPROVIDES:${PN} += "config-openQA-munin \
openQA-munin"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
munin \
munin-node \
perl"

inherit rpm
