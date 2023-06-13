SUMMARY = "Vietnamese Input Method Engine for SCIM using Unikey IME"
DESCRIPTION = "SCIM (Smart Common Input Method) is an input method (IM) platform. \
scim-unikey is a IME for scim. Use for type Vietnamese \
Support via forum at: http://forum.ubuntu-vn.com/viewforum.php?f=85"
LICENSE = "GPL-2.0"

PV = "0.3.2"

RPM_NAME = "scim-unikey-0.3.2-1.28.aarch64.rpm"
RPM_HASH = "90ea309a8c6acac1b666b1f585476556ecb634b32547b9ce7df1d9bac52476850fb94a60d35e6f823061a8c8c15392107229f82ba6c8ef7ba527d71bcb60605c"

RPROVIDES:${PN} += "libunikey-scim.so.1()(64bit) \
scim-unikey \
scim-unikey(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libscim-1.0.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
