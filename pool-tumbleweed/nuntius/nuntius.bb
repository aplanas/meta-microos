SUMMARY = "Get notifications from the phone or tablet"
DESCRIPTION = "Nuntius is a daemon that connects to another Nuntius app running on \
a phone or a tablet and proxies the notifications using Bluetooth."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "nuntius-0.2.0-3.15.aarch64.rpm"
RPM_HASH = "2af5759eb8bd86bab6fde9acd9d7b8c2d2ad931d7a1be3edc78e4e0567e277dfffc439c7133c7882eda950e919af30fa0c7b97702c74719ef0ae4542f603b6b1"

RPROVIDES:${PN} += "application() \
application(org.holylobster.nuntius.desktop) \
metainfo() \
metainfo(org.holylobster.nuntius.appdata.xml) \
nuntius \
nuntius(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit)"

inherit rpm
