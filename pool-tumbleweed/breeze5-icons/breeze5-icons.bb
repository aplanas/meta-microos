SUMMARY = "Breeze icon theme"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "breeze5-icons-5.106.0-1.1.noarch.rpm"
RPM_HASH = "0f8d9afe698bae87512b70b65b54dff710eee812c00e55cec1e2bb867be6c6d0c838d415d038ee21e6162ed25cb76788a56bc8cec82a41a03854b3b04e165831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-icons"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
