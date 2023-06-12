SUMMARY = "Compositing manager for X servers"
DESCRIPTION = "xcompmgr is a sample compositing manager for X servers supporting the \
XFIXES, DAMAGE, RENDER, and COMPOSITE extensions. It enables basic \
eye-candy effects."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "xcompmgr-1.1.9-1.2.aarch64.rpm"
RPM_HASH = "d1faf0db6bda90164bc7d4fef580b96093d8d749694b1e46d9c7c4edd5e662fd2a35d4116e7a2a59d14c94254c7c2613e81288533d031d57e8619e1da2b2fdf1"

RPROVIDES:${PN} += "xcompmgr \
xcompmgr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
