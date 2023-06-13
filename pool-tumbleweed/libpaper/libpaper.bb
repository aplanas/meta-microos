SUMMARY = "Enables users to indicate their preferred paper size"
DESCRIPTION = "This package enables users to indicate their preferred paper \
size, provides the libpaper(1) utility to find the user's preferred \
default libpaper size and give information about known sizes, and \
specifies system-wide and per-user libpaper size catalogues, which can be \
can also be used directly (see libpaperspecs(5))."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libpaper-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "9ef5c0dcd925d820240f38ddd574d00cb39d804251e97932c822b2fa74f2da6baf9a0c057f3fea6a47fc1e9f5ae2b0d5ffa8c545ac4af1a5889d8c7cec4ddd90"

RPROVIDES:${PN} += "config(libpaper) \
libpaper \
libpaper(aarch-64) \
paper:/etc/paperspecs"

RDEPENDS:${PN} += ""

inherit rpm
