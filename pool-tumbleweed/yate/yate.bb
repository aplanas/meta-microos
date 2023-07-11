SUMMARY = "Yet Another Telephony Engine"
DESCRIPTION = "Yate is a telephony engine. Its focus is on Voice over Internet \
Protocol (VoIP) and PSTN. It can be extended. Voice, video, data and \
instant messenging can be unified under Yate's routing engine."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "yate-6.4.0-4.10.aarch64.rpm"
RPM_HASH = "b24830320d925b88f09734a643b85084d8ecb7e0c78cfc0959bb56f1ab2eb7fbd49b37b81b695b2fa2c7b3ba8e0aba318c8c4902c705d39c844b01068a8d0f35"

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
