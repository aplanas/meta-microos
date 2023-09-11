SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693565748.f367431"

RPM_NAME = "openQA-local-db-4.6.1693565748.f367431-1.1.aarch64.rpm"
RPM_HASH = "a75fd2a3fef55a8d475dff31ec7f5316c0a1ceecebe480b788a2ed7ff945c807910607d5c736a749dbaa8eb27195ce4748c7cd20bca3962f7ec9e6f572894b5a"

RPROVIDES:${PN} += "openQA-local-db"

RDEPENDS:${PN} += "/usr/bin/sh \
openQA \
postgresql-server"

inherit rpm
