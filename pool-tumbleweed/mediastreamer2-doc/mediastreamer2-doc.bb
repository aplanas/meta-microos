SUMMARY = "Documentation for the mediastreamer2 library"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library. \
 \
This package contains documentation files"
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "mediastreamer2-doc-5.2.49-1.2.aarch64.rpm"
RPM_HASH = "67bcf6f58b7baa39bbfcc1a7ace215c4721c5cf82d8793c564afb0ecd9e0253f7773f4a6175d4a1819e53ee0cf82822dcd4fb1f0ff2caf6bdf3f1f5577b725cd"

RPROVIDES:${PN} += "mediastreamer2-doc \
mediastreamer2-doc(aarch-64)"

RDEPENDS:${PN} += "mediastreamer2"

inherit rpm
