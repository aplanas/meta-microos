SUMMARY = "LeechCraft Script-Based Lyrics Module"
DESCRIPTION = "This package provides a lyrics finder plugin for LeechCraft. \
 \
Textogroose is a kind of supplement to DeadLyrics for sites \
too complex to be described by DeadLyrics rules."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-textogroose-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "ba06ff013001126469498d5d20b758cb3036e04400c1ce96d324ed2e96a2426989092d0e39700c500debe03b4ebdf615cc133ef86d356c646ea4655f2adc7095"

RPROVIDES:${PN} += "leechcraft-lyricsprovider \
leechcraft-textogroose \
libleechcraft-textogroose.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-http \
leechcraft-summaryrepresentation \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
