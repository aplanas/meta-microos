SUMMARY = "Tool to measure"
DESCRIPTION = "QLoud - tool to measure loudspeaker frequency and step responses and \
distortions. \
 \
Target use: \
 * loudspeakers DIY-ing (xovers tuning)."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "qloud-1.4.2-1.3.aarch64.rpm"
RPM_HASH = "a6b9e91a3c68a76290af6c74b54075b3e85bcd9a58f0857bcc7606e7dcf5113e16614cfa7dcba45e37075e46cbc28bf2be84d724665883c9d7e79db9524bfb21"

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
