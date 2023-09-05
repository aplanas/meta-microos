SUMMARY = "A KDE Software for Music Education"
DESCRIPTION = "Application for Music Education. \
 \
Minuet aims at supporting students and teachers in many aspects \
of music education, such as ear training, first-sight reading, \
solfa, scales, rhythm, harmony, and improvisation. \
Minuet makes extensive use of MIDI capabilities to provide a \
full-fledged set of features regarding volume, tempo, and pitch \
changes, which makes Minuet a valuable tool for both novice and \
experienced musicians."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "minuet-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "58b2a9eaceab8e6ec01e095a3f234c35b01ea31474d38f926e902ad94520deca9cb976996e2fe253304a9d5dd835b13f9c1565f8570309e8e0871cdf43cc8155"

RPROVIDES:${PN} += "libminuetinterfaces.so.0.3.0 \
minuet"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libqt5-qtquickcontrols2 \
libstdc++.so.6"

inherit rpm
