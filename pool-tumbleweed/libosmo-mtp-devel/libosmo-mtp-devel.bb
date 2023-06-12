SUMMARY = "Development files for the Osmocom MTP library"
DESCRIPTION = "MTP is part of SS7 used for communication in Public Switched \
Telephone Networks. \
 \
This subpackage contains the development files for the Osmocom MTP \
library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-mtp-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "33bfdb6aba24282805af0c3216aa19981d366b4d029bb10b9ccffef2053719d0a6711641483766f93d352aa3ae1ef7fefd216fe9871876bac52e2ad65160b06f"

RPROVIDES:${PN} += "libosmo-mtp-devel \
libosmo-mtp-devel(aarch-64) \
pkgconfig(libosmo-mtp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-mtp-1_7_0"

inherit rpm
