SUMMARY = "Palapeli's standard puzzle files"
DESCRIPTION = "This package contains the standard puzzle files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "palapeli-data-23.04.1-1.1.noarch.rpm"
RPM_HASH = "eb319c11cb159e16c1f498ffc5b5b666f7350300c33c80147cc1a5307e8a1805a57f2cfb200b0aecfbf5147bf79e482ab7a835dea7565d9c92c1f0e3d482fbf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(palapeli-data) \
palapeli-data"

RDEPENDS:${PN} += "palapeli"

inherit rpm
