SUMMARY = "Smart Card Utilities"
DESCRIPTION = "OpenSC provides a set of utilities to access smart cards. It mainly \
focuses on cards that support cryptographic operations. It facilitates \
their use in security applications such as mail encryption, \
authentication, and digital signature. OpenSC implements the PKCS#11 \
API. Applications supporting this API, such as Mozilla Firefox and \
Thunderbird, can use it. OpenSC implements the PKCS#15 standard and aims \
to be compatible with every software that does so, too. \
 \
Before purchasing any cards, please read carefully documentation on the \
web pageonly some cards are supported. Not only card type matters, but \
also card version, card OS version and preloaded applet. Only subset of \
possible operations may be supported for your card. Card initialization \
may require third party proprietary software."
LICENSE = "LGPL-2.1-or-later"

PV = "0.23.0"

RPM_NAME = "opensc-0.23.0-2.1.aarch64.rpm"
RPM_HASH = "2c40db0e8c7dc29a8ca4aff552736a600e2c5431a5d886ce7185eb18bffe55700a4a90ec0d58cd82bb3deed13732b2ab9ffae0345e92825885ecbdccd296b85f"

RPROVIDES:${PN} += "config-opensc \
libopensc.so.8 \
libsmm-local.so.8 \
opensc \
pkgconfig-opensc-pkcs11"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libreadline.so.8 \
libz.so.1 \
pcsc-lite"

inherit rpm
