SUMMARY = "Deepin File Manager libraries"
DESCRIPTION = "This package contains the libraries for deepin-file-manager"
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "libdfm-extension5-5.6.4-3.7.aarch64.rpm"
RPM_HASH = "6af728439eb52fc07b2737bd6bf6985fde9002e3647ba0b54b822f419a0909efaa3c6f7a2e13bd2007f6681dbdb7ce0f81bf93bbc3811b0a74d002ffe49f6073"

RPROVIDES:${PN} += "libdfm-extension.so.5 \
libdfm-extension5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
