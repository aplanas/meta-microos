SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "python3-shiboken6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4c4522320ddd13c45d56cd7288400c3ef1ff0ff43c96716ebc3a849040fae2beb45a83b046ab9c5e438a284a57134189c72da7fc41bec1f0d7d6b399466f2228"

RPROVIDES:${PN} += "libshiboken6.abi3.so.6.5()(64bit) \
python3-shiboken6 \
python3-shiboken6(aarch-64) \
python3.10dist(shiboken6) \
python3dist(shiboken6)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libgcc_s.so.1()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
python(abi)"

inherit rpm
