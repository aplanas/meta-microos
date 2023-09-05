SUMMARY = "Sound Conversion Tools and Library"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "14.4.2"

RPM_NAME = "sox-devel-14.4.2-7.1.aarch64.rpm"
RPM_HASH = "eed8fd3a118e3b0e7e2aca55b2c943352c06e76146f7333f9207289279960fdbc8c8aed5d4a983076ece94683b3812ba70fd35d5a7446f967de13d29fb58ca64"

RPROVIDES:${PN} += "pkgconfig-sox \
sox-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsox3"

inherit rpm
