SUMMARY = "Url wrapper for kanku:// urls"
DESCRIPTION = "A URL wrapper to start kanku from kanku:// urls in the browser."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-urlwrapper-0.14.0-1.5.noarch.rpm"
RPM_HASH = "735b4289426d97a9be9d3423e8ce72da40e9edf3d76e70fe2f866322b4096569352f515f282bad2b1b9c415bcf3576c8bd5c1a86bb7ba5c52c10b9ad6cca28bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-urlwrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
kanku-cli \
shared-mime-info"

inherit rpm
