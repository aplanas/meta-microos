SUMMARY = "Sound Conversion Tools and Library"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "14.4.2"

RPM_NAME = "sox-devel-14.4.2-6.1.aarch64.rpm"
RPM_HASH = "1a37a116f273f49a94be0780fe185223cf3437f1c470238e693fed8b136b3bc82d3a72ed3d6c1bc34fc25e4edf0c5cf7765a33c96debe979d92dfedf706105da"

RPROVIDES:${PN} += "pkgconfig(sox) \
sox-devel \
sox-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsox3"

inherit rpm
