SUMMARY = "Sound Conversion Tools and Library"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "14.4.2"

RPM_NAME = "sox-devel-14.4.2-6.2.aarch64.rpm"
RPM_HASH = "fd07ef8b78772d13d82380ce63869a46bab59b5a3357bd5b10019b189f3e4e26e0a4c50a6a9e50596803350a4b9e1cafd694792e9b31d7f702347841c50e1846"

RPROVIDES:${PN} += "pkgconfig-sox \
sox-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsox3"

inherit rpm
