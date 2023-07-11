SUMMARY = "Development files for the libxkbcommon library"
DESCRIPTION = "xkbcommon is a keymap handling library, which can parse XKB \
descriptions (e.g. from xkeyboard-config), and use this to help its \
users make sense of their keyboard input. Unfortunately, X11's \
requirements mean this is not actually usable for the X server, but it \
should be perfectly usable for client toolkits, as well as alternative \
windowing systems, compositors and system-level clients such as \
Wayland and kmscon. \
 \
This package contains the development headers for the library found \
in libxkbcommon."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon-devel-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "2ea4b68176e31ba552580abe589da9c6b074929995806cf255de90ba340edaa4568528c0a688d9b24287de34fc695ccfa4dd91b7e2c941bea2cbe56ab9a0e721"

RPROVIDES:${PN} += "libxkbcommon-devel \
pkgconfig-xkbcommon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbcommon0"

inherit rpm
