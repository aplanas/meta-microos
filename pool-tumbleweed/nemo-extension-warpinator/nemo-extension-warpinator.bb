SUMMARY = "Warpinator extension for nemo"
DESCRIPTION = "Warpinator is a simple app that allows users to share files across the LAN. \
 \
This package provides an extension to use warpinator from nemo file browser."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.4"

RPM_NAME = "nemo-extension-warpinator-1.6.4-1.1.noarch.rpm"
RPM_HASH = "8eb10a47759be36217b2b0d7cd93c89b04dae9fd7d39f129b170e0fffe9c0ff5b5b12db00f354163bfc8133801168f327046fcc9b17b34180d5fab1098754018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-warpinator"

RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
warpinator"

inherit rpm
