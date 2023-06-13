SUMMARY = "Yet Another Telephony Engine"
DESCRIPTION = "Yate is a telephony engine. Its focus is on Voice over Internet \
Protocol (VoIP) and PSTN. It can be extended. Voice, video, data and \
instant messenging can be unified under Yate's routing engine."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "yate-6.4.0-4.9.aarch64.rpm"
RPM_HASH = "daf5985ca654141a53a57d63ddeda87b387f9fd57c14181633a0d1482024d886aac1607b110f59fc46e71d0af31f3247cc30148dfb785cbec446ad459a7849f2"

RPROVIDES:${PN} += "config(yate) \
yate \
yate(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgsm.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsctp.so.1()(64bit) \
libsctp.so.1(VERS_1)(64bit) \
libsctp.so.1(VERS_3)(64bit) \
libspandsp.so.3()(64bit) \
libspeex.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libusb-1.0.so.0()(64bit) \
libyate.so.6.4.0()(64bit) \
libyateasn.so.6.4.0()(64bit) \
libyatejabber.so.6.4.0()(64bit) \
libyatemgcp.so.6.4.0()(64bit) \
libyateradio.so.6.4.0()(64bit) \
libyatescript.so.6.4.0()(64bit) \
libyatesig.so.6.4.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
