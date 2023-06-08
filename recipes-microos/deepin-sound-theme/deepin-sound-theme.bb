SUMMARY = "Deepin sound theme"
DESCRIPTION = "Sound files for the Deeping Desktop Environment."
LICENSE = "GPL-3.0"

PV = "15.10.6"

RPM_NAME = "deepin-sound-theme-15.10.6-1.6.noarch.rpm"
RPM_HASH = "ceb05ecf8799dbf7d730f800936ee3e94008c94d03af4835853a267c9be242aaea66bcff6a0daa504071f8293a96f8847a91a4c2697ebf7dff8cb661f5e04aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-sound-theme"
RDEPENDS:${PN} += ""

inherit rpm
