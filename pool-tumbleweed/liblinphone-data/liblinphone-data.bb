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

RPM_NAME = "liblinphone-data-5.2.50-1.1.noarch.rpm"
RPM_HASH = "9bba5783e03f5c2a8ca08937caaa4b3eb8a7e52bcd03ecb8f3f097d7bd7acdbb06f17b3c47e437b0e7497e13b7563c65ab025c49692f2789ec9c40666586f127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblinphone-data"
RDEPENDS:${PN} += ""

inherit rpm
