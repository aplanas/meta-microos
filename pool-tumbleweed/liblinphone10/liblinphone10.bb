SUMMARY = "Web Phone library"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems. \
 \
This package contains a library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.50"

RPM_NAME = "liblinphone10-5.2.50-1.1.aarch64.rpm"
RPM_HASH = "233c4d2b448e8528328c754416ed3821810f82a604163dc640233f64d8005b5f4b47693cbc10d4f892fa23dab937b10ca98f3b68a7ab3d1d0e1bb187df424001"

RPROVIDES:${PN} += "liblinphone \
liblinphone.so.10()(64bit) \
liblinphone10 \
liblinphone10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbctoolbox.so.1()(64bit) \
libbelcard.so.1()(64bit) \
libbellesip.so.1()(64bit) \
libbelr.so.1()(64bit) \
libbzrtp.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblime.so.0()(64bit) \
libm.so.6()(64bit) \
libmediastreamer.so.11()(64bit) \
libortp.so.15()(64bit) \
libsoci_core.so.4.0()(64bit) \
libsoci_sqlite3.so.4.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxerces-c-3.2.so()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
