SUMMARY = "KF5 extension for mediainfo-gui"
DESCRIPTION = "KF5 context menu extension for mediainfo-gui."
LICENSE = "GPL-2.0-or-later"

PV = "23.06"

RPM_NAME = "kf5-mediainfo-23.06-1.1.aarch64.rpm"
RPM_HASH = "dc5277ba52601698fe5ec9e1955e7365ab3b4f18994da95069561ba4c0e3cd9a08f1da84b4b93bc41ddcf3a1d56d6e9aa1f20807ecbad49737edae005ec5c797"

RPROVIDES:${PN} += "kde4-mediainfo \
kf5-mediainfo"

RDEPENDS:${PN} += "mediainfo-gui"

inherit rpm
