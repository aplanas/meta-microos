SUMMARY = "Audible beat generator"
DESCRIPTION = "A program for Elementary OS that produces an audible beat — a click \
or other sound — at regular intervals that the user can set in beats \
per minute (BPM)."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "metronome-1.0.0-1.19.aarch64.rpm"
RPM_HASH = "c45e8787331462601935c3d7142128c746302b39686ce8bdf1ecda4bb369ae150113ed66b8bfdd826874c2bd2ef19c3ba498da8bc48e8edf9640dfd01f99fe48"

RPROVIDES:${PN} += "application() \
application(com.github.artemanufrij.metronome.desktop) \
metainfo() \
metainfo(com.github.artemanufrij.metronome.appdata.xml) \
metronome \
metronome(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
