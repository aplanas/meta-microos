SUMMARY = "LeechCraft Script-Based Lyrics Module"
DESCRIPTION = "This package provides a lyrics finder plugin for LeechCraft. \
 \
Textogroose is a kind of supplement to DeadLyrics for sites \
too complex to be described by DeadLyrics rules."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-textogroose-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "ed99c662c49d798009bf263ad6045bf3da65cfd4ebfaae255e7d0e50ead89b2a99ee46020f066ba7a60a59c6e9b9d71c536d3621aaf6e944425f497a6bbdf4c7"

RPROVIDES:${PN} += "leechcraft-lyricsprovider \
leechcraft-textogroose \
leechcraft-textogroose(aarch-64) \
libleechcraft_textogroose.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-http \
leechcraft-summaryrepresentation \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
