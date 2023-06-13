SUMMARY = "Shared libraries for Yate"
DESCRIPTION = "Yate is a telephony engine. Its focus is on Voice over Internet \
Protocol (VoIP) and PSTN. It can be extended. Voice, video, data and \
instant messenging can be unified under Yate's routing engine."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "libyate6_4_0-6.4.0-4.9.aarch64.rpm"
RPM_HASH = "a748429c27095b8acd55569cfec0e83d92847b944b7e42631798f577e87710ece2e6626bd87e617d7b205c128ccfe88a4a8bd4ef8470a64b75640fe70262ea0f"

RPROVIDES:${PN} += "libyate.so.6.4.0()(64bit) \
libyate6_4_0 \
libyate6_4_0(aarch-64) \
libyateasn.so.6.4.0()(64bit) \
libyatejabber.so.6.4.0()(64bit) \
libyatemgcp.so.6.4.0()(64bit) \
libyateradio.so.6.4.0()(64bit) \
libyatescript.so.6.4.0()(64bit) \
libyatesig.so.6.4.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
