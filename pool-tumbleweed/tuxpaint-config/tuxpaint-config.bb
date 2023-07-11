SUMMARY = "Configuration tool for Tux Paint"
DESCRIPTION = "Tux Paint has a rich set of configuration options, controllable via \
command-line options or configuration files. This configuration tool \
provides a point-and-click interface for administrators to tailor \
Tux Paint to suit the needs of their users."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.18"

RPM_NAME = "tuxpaint-config-0.0.18-1.8.aarch64.rpm"
RPM_HASH = "450b3b38984a546a92d4b19d9d948464ccecdc1b89affb9aaf3064c7944d218aa10db3eaca1019389f6986480e92e094ec315fcd6a030d11f4fc531bc1d8f900"

RPROVIDES:${PN} += "tuxpaint-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libpaper.so.2 \
libstdc++.so.6 \
libunibreak.so.5 \
tuxpaint-config-lang"

inherit rpm
