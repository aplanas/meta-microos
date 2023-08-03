SUMMARY = "Network support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for network operations support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6Network0-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "e6f0fb25ba01912696e1ebc9fa962abe863eea683e9675a4477d471160afeb4a8a0da42a0c30383959c064eab3bed32206abe61a69f9fd8941ce9661a536b468"

RPROVIDES:${PN} += "libQCoro6Network.so.0 \
libQCoro6Network0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQCoro6Core.so.0 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
