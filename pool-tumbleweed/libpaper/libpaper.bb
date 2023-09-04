SUMMARY = "Enables users to indicate their preferred paper size"
DESCRIPTION = "This package enables users to indicate their preferred paper \
size, provides the libpaper(1) utility to find the user's preferred \
default libpaper size and give information about known sizes, and \
specifies system-wide and per-user libpaper size catalogues, which can be \
can also be used directly (see libpaperspecs(5))."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libpaper-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "4e9ac0234751f219946c623ee3a637a9b2db97595591d280827158278459a3874a951c2af73212ee18f753a55e16d6ddcd38c4a0e31ea99ea93c6b63c069ba4a"

RPROVIDES:${PN} += "config-libpaper \
libpaper \
paper-/etc/paperspecs"

RDEPENDS:${PN} += ""

inherit rpm
