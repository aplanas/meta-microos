SUMMARY = "Tool to measure"
DESCRIPTION = "QLoud - tool to measure loudspeaker frequency and step responses and \
distortions. \
 \
Target use: \
 * loudspeakers DIY-ing (xovers tuning)."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "qloud-1.4.2-1.4.aarch64.rpm"
RPM_HASH = "30b67ad4fcba596efff075ac76fffc8af2948ae5436159159426b078ef84234f210b1c50b5676ab4cc230726f1e487ece5cfa44cc6ccd40faf3527de89b0a291"

RPROVIDES:${PN} += "qloud"

RDEPENDS:${PN} += "jack \
ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
