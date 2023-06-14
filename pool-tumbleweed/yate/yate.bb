SUMMARY = "Yet Another Telephony Engine"
DESCRIPTION = "Yate is a telephony engine. Its focus is on Voice over Internet \
Protocol (VoIP) and PSTN. It can be extended. Voice, video, data and \
instant messenging can be unified under Yate's routing engine."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "yate-6.4.0-4.9.aarch64.rpm"
RPM_HASH = "daf5985ca654141a53a57d63ddeda87b387f9fd57c14181633a0d1482024d886aac1607b110f59fc46e71d0af31f3247cc30148dfb785cbec446ad459a7849f2"

RPROVIDES:${PN} += "config-yate \
yate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcrypto.so.3 \
libgsm.so.1 \
libm.so.6 \
libsctp.so.1 \
libspandsp.so.3 \
libspeex.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libyate.so.6.4.0 \
libyateasn.so.6.4.0 \
libyatejabber.so.6.4.0 \
libyatemgcp.so.6.4.0 \
libyateradio.so.6.4.0 \
libyatescript.so.6.4.0 \
libyatesig.so.6.4.0 \
libz.so.1"

inherit rpm
