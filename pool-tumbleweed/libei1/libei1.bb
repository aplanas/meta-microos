SUMMARY = "Library for emulated input in Wayland"
DESCRIPTION = "libei is a library to send Emulated Input (EI) to a matching Emulated \
Input Server (EIS) which can receive those events with libeis. \
 \
It targets Wayland and provides separation, distinction and control, \
which, for comparison, are not available with XTEST (X11's emulated \
input)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "libei1-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "cb7741515c15ca02410b20b694ed0e797f6ba668aa531128c710b44a62b1c70fb059aa0627586673f10bbfbcf3b55d12187dd4ec0f196d08a75065471436e3ef"

RPROVIDES:${PN} += "libei.so.1 \
libei1 \
libeis.so.1 \
liboeffis.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
