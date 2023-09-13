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

PV = "5.2.98"

RPM_NAME = "liblinphone-data-5.2.98-2.1.noarch.rpm"
RPM_HASH = "2d20c9b7ea356414d16f0d8bf4de325484a593316444f0dc890aa64c975c5a5f623611803c8aafa26005d6d3992f1d7aba9011b3ca808c6d4e972b82f208e24d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblinphone-data"

RDEPENDS:${PN} += ""

inherit rpm
