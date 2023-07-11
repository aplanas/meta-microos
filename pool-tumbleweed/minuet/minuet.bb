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

PV = "23.04.3"

RPM_NAME = "minuet-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "10cdaa773fe84a85ef5e3e9f5c054c8570eb4cced9639ecbc981a25c599e3b1df9695c68a975f42fc9833d7dd3873565ffe95d73227c381db1273f375bab98ca"

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
