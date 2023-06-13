SUMMARY = "Operating system and hypervisor information management library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libosinfo-1_0-0-1.10.0-3.3.aarch64.rpm"
RPM_HASH = "53e08bfa96091236fd78609de340f65c22d2f12e8de5a8024d8fcdd5242b2fa613efc5e0e127d0afe4ec046bed8e0342f6b5c676f8bfbed4d70da79a42a110ee"

RPROVIDES:${PN} += "libosinfo-1.0.so.0()(64bit) \
libosinfo-1_0-0 \
libosinfo-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hwdata \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libosinfo \
libsoup-3.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit)"

inherit rpm
