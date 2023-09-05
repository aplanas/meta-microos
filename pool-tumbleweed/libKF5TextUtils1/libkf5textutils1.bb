SUMMARY = "TextUtils library"
DESCRIPTION = "The TextUtils library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libKF5TextUtils1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "6f4aa5a4129d83036558cd3ef043494c84940767cb5657979c3412c5f2bbe8699f21825c026234c6b72a2f1c46837961313e795db85e254e0d67886e960e5cc3"

RPROVIDES:${PN} += "libKF5TextUtils.so.1 \
libKF5TextUtils1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5TextEmoticonsCore1 \
libQt5Core.so.5 \
libc.so.6"

inherit rpm
