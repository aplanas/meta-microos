SUMMARY = "SDL port of the sopwith game"
DESCRIPTION = "This is a port of the classic computer game 'Sopwith' to run on modern \
computers and operating systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "sopwith-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "472aa8a4568df6cb3eb3360c36e5d05eff4b46c87183370a5a4df50eaba0a348a4568ae307a63fc36641f0bb19bdf348fb407f7464c53c6c2e13e5580c9d8cce"

RPROVIDES:${PN} += "sopwith"

RDEPENDS:${PN} += "libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
