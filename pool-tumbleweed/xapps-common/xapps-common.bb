SUMMARY = "Common files for XApp desktop applications"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This package includes files that are shared between several XApp \
applications (i18n files and configuration schemas)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.1"

RPM_NAME = "xapps-common-2.4.1-1.4.noarch.rpm"
RPM_HASH = "f6b5997346f33f6e366780bf4f95c131a8f2a414d6d90a77fadb7780ca021434a16262e43e1c122a0f55834a30642c0dda4ce351eef355d3d84c093d20d6f493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xapps-common"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
