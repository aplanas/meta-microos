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

RPM_NAME = "liblinphone-data-5.2.98-1.1.noarch.rpm"
RPM_HASH = "0dd2c1abc94eb55f06593d062b40e6148e2ef4f3658e8b89208601782f0a023a9d6d9ac80d6ae35c1363b0138e9e85a53a94e4b565fd6c74a8c44ae8c6004167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblinphone-data"

RDEPENDS:${PN} += ""

inherit rpm
