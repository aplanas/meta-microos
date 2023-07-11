SUMMARY = "XML-RPC library for Qt"
DESCRIPTION = "libmaia is a XML-RPC library for Qt."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "libmaia1-0.9.0-1.26.aarch64.rpm"
RPM_HASH = "f453b8375efc2a2ba2df36ca540757d41b6ac155b59fb67824c312d2d491f8c323e08aaae206366c6746a6819c26b9db8a45c966a7d752c841efdba3800fbb34"

RPROVIDES:${PN} += "libmaia.so.1 \
libmaia1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
