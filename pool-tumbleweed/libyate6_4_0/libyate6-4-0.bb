SUMMARY = "Shared libraries for Yate"
DESCRIPTION = "Yate is a telephony engine. Its focus is on Voice over Internet \
Protocol (VoIP) and PSTN. It can be extended. Voice, video, data and \
instant messenging can be unified under Yate's routing engine."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "libyate6_4_0-6.4.0-4.9.aarch64.rpm"
RPM_HASH = "a748429c27095b8acd55569cfec0e83d92847b944b7e42631798f577e87710ece2e6626bd87e617d7b205c128ccfe88a4a8bd4ef8470a64b75640fe70262ea0f"

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
