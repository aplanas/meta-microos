SUMMARY = "Clipboard Manager"
DESCRIPTION = "Clipboard history manager for Elementary OS."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "clipped-1.1.1-1.19.aarch64.rpm"
RPM_HASH = "52ce1d07e86decb1f8d0bb5da5ebd31bc4b3877d289546f0dfae5da854f7f642b2227b9a092d6cf63b169406fcedec4dc1a08cfc58f2996812f3b2905036c34f"

RPROVIDES:${PN} += "clipped"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsqlite3.so.0"

inherit rpm
