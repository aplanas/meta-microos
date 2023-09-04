SUMMARY = "Client Library for Communicating with GDM Greeter Server"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libgdm1-44.1-3.1.aarch64.rpm"
RPM_HASH = "0bad4a6d10cb46a24756b306a8f6b22627ec09b425cc4442761ecc0fceaae58bc04f3813f6f1e75e76d2e346a861349d4cfd0469cde610d3251c14f5974b7770"

RPROVIDES:${PN} += "libgdm.so.1 \
libgdm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
gdm-schema \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
