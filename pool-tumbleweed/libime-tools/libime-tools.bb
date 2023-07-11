SUMMARY = "Toolkit for libime"
DESCRIPTION = "This package provides toolkit for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libime-tools-1.0.17-1.3.aarch64.rpm"
RPM_HASH = "e4d5212c373674862d27a73f29eae92e76587fa8177beeb192624cdf9313e3fb66c8c9b3f7a62ec661a865889c4dd2f8e6a717107c49ea9271be123e7b009ad8"

RPROVIDES:${PN} += "libime-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libIMEPinyin.so.0 \
libIMETable.so.0 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
