SUMMARY = "Command-line interface to various pastebins"
DESCRIPTION = "Command-line interface to communicate with various pastebin services."
LICENSE = "MIT"

PV = "2.33"

RPM_NAME = "wgetpaste-2.33-1.2.noarch.rpm"
RPM_HASH = "8607158e263b34d33dea355c7635f0533e65c49e84632e00d6bd40e66f1a83f966737932fe9b290bba1ebd99704220225d21331c8bd1ce563d2741c0de9c3d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(wgetpaste) \
wgetpaste"

RDEPENDS:${PN} += "/usr/bin/env \
bash \
coreutils \
wget"

inherit rpm
