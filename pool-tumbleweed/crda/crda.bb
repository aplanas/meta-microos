SUMMARY = "802.11 central regulatory domain agent"
DESCRIPTION = "The crda binary provides access to the wireless-regdb to the kernel \
through udev."
LICENSE = "SUSE-Copyleft-Next-0.3.0"

PV = "4.15"

RPM_NAME = "crda-4.15-1.1.aarch64.rpm"
RPM_HASH = "7cc8dc33076695027cb3f7f9e453f19cc0a2933d7ae176ac555d538aeb54944a37484ad1e491a6963f9d803fbcdab94731f9f1eba6aa58afafbcfc7209059529"

RPROVIDES:${PN} += "crda \
libreg.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
wireless-regdb"

inherit rpm
