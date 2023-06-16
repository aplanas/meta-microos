SUMMARY = "MIME type definitions and documentation for libmirage"
DESCRIPTION = "libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package contains the MIME type definitions and documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage-data-3.2.6-1.8.noarch.rpm"
RPM_HASH = "49f8e7a530871bc745c967fd361a4f46e8076132fbd75b72276a8774c1118e5879bd133873ec53582535a0582b6eecf21b6a75f61882b5eb754dcddf17264381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmirage-data"

RDEPENDS:${PN} += "/usr/bin/sh \
shared-mime-info"

inherit rpm
