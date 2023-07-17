SUMMARY = "Documentation for qt6-remoteobjects in QCH format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "73626c7d847b2599218c79d98b84be18b9e4346493f30c04037a33b7a71a38c8cd86fa3c23d0c97664a5ac043d77993c2b9578690009a25692bd32b845e8971f"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
