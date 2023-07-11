SUMMARY = "VNC client for character terminals"
DESCRIPTION = "headmore is a client for Virtual Network Computing (VNC), \
it is designed for running in character terminals such as \
Linux VT, xterm, or any other terminal emulator. headmore \
is fully capable of directing keyboard input to VNC and \
control mouse cursor movements."
LICENSE = "GPL-3.0"

PV = "1.2"

RPM_NAME = "headmore-1.2-1.24.aarch64.rpm"
RPM_HASH = "3295573477c442b2e6f5e1baec66db66f8cb29fcf2e2348bc874c6536c4c9592c8e4576afb7f27ce32940dc8a02ae5c97205fba30a3bfbab14906d6562554e7b"

RPROVIDES:${PN} += "headmore"

RDEPENDS:${PN} += "libc.so.6 \
libcaca.so.0 \
libvncclient.so.1"

inherit rpm
