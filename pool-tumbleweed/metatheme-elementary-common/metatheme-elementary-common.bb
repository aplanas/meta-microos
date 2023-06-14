SUMMARY = "Common files for the Elementary GTK theme"
DESCRIPTION = "The official elementary GTK theme designed to be smooth, attractive, fast, \
and usable. \
 \
This package provides the files common to the GTK+ themes and the window \
manager themes as well as background images."
LICENSE = "GPL-3.0-only"

PV = "5.3.0"

RPM_NAME = "metatheme-elementary-common-5.3.0-1.10.noarch.rpm"
RPM_HASH = "ce6901067a09235a3538a35ae7b851876f787f7f97c61c9ef4d74b0e64eaa0f2681b6914faf1fbbf7d109f039aa5c80ddba2e700304a46f029c3da80d1dd4f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-elementary-common"

RDEPENDS:${PN} += ""

inherit rpm
