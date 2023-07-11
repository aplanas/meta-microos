SUMMARY = "Web Phone data files"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems. \
 \
This package contains data files such as sounds."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.50"

RPM_NAME = "liblinphone-data-5.2.50-1.3.noarch.rpm"
RPM_HASH = "e486705c0c502e663d98dbc36cce171744e4adb39493c7319fa97836fdc981307b20a3c3aeb9ee4b98441f2279685db189f7e8b4161b2a11e3e7c09a019285e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblinphone-data"

RDEPENDS:${PN} += ""

inherit rpm
