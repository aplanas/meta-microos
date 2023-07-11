SUMMARY = "Shared libraries for Yate"
DESCRIPTION = "Yate is a telephony engine. Its focus is on Voice over Internet \
Protocol (VoIP) and PSTN. It can be extended. Voice, video, data and \
instant messenging can be unified under Yate's routing engine."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "libyate6_4_0-6.4.0-4.10.aarch64.rpm"
RPM_HASH = "7a09da0ff1c0ad87915b1e7fd347f37d60973f09a48933d7494be705ddc982de6b8020943fc19918e4278cfc6f0886e1f2c8406216106f2dc34757e6b843399f"

RPROVIDES:${PN} += "libyate.so.6.4.0 \
libyate6-4-0 \
libyateasn.so.6.4.0 \
libyatejabber.so.6.4.0 \
libyatemgcp.so.6.4.0 \
libyateradio.so.6.4.0 \
libyatescript.so.6.4.0 \
libyatesig.so.6.4.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
