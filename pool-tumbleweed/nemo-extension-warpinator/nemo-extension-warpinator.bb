SUMMARY = "Warpinator extension for nemo"
DESCRIPTION = "Warpinator is a simple app that allows users to share files across the LAN. \
 \
This package provides an extension to use warpinator from nemo file browser."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.3"

RPM_NAME = "nemo-extension-warpinator-1.6.3-1.2.noarch.rpm"
RPM_HASH = "987c095c7a21595719f09e5be5448fa2f82b5ec10a3e1a31a730bf9238a90f450f4db0a66eb53a7d9506f04953b832d9975ccffc9f8ee7ff6c4e779df953fee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-warpinator"

RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
warpinator"

inherit rpm
