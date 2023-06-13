SUMMARY = "Runtime libraries for libverto"
DESCRIPTION = "libverto provides a way for libraries to expose asynchronous \
interfaces without having to choose a particular event loop, \
offloading this decision to the end application which consumes the \
library. \
 \
If you are packaging an application, not library, based on libverto, \
you should depend either on a specific implementation module or you \
can depend on the virtual provides 'libverto-module-base'. This will \
ensure that you have at least one module installed that provides io, \
timeout and signal functionality. Currently glib is the only module \
that does not provide these three because it lacks signal. However, \
glib will support signal in the future."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto1-0.3.2-3.1.aarch64.rpm"
RPM_HASH = "2686b6b2fbcdb3d3c715091541adea32893d79316555e1de939a4a6297a552a68fae1233db2398a93a1bf4a80d5c5e7a5f3ef3b02d99b8184b06fdb3d4175672"

RPROVIDES:${PN} += "libverto.so.1()(64bit) \
libverto1 \
libverto1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
