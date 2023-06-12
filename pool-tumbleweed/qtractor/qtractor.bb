SUMMARY = "An Audio/MIDI multi-track sequencer"
DESCRIPTION = "Qtractor is an Audio/MIDI multi-track sequencer application \
written in C++ around the Qt toolkit. \
 \
The initial target platform will be Linux, where the Jack Audio \
Connection Kit (JACK) for audio, and the Advanced Linux Sound \
Architecture (ALSA) for MIDI, are the main infrastructures to \
evolve as a fairly-featured Linux Desktop Audio Workstation GUI, \
specially dedicated to the personal home-studio."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.32"

RPM_NAME = "qtractor-0.9.32-2.1.aarch64.rpm"
RPM_HASH = "41f76cd525e19c61ca952c421c6c57b422c823a84b043106a8d1c407a0810d0a5d55965eb837f0fcadb694827830e305fb65ea6e7b9419ca58b3f890e41fb883"

RPROVIDES:${PN} += "application() \
application(org.rncbc.qtractor.desktop) \
metainfo() \
metainfo(org.rncbc.qtractor.metainfo.xml) \
mimehandler(application/x-qtractor-archive) \
mimehandler(application/x-qtractor-session) \
mimehandler(application/x-qtractor-template) \
qtractor \
qtractor(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Xml.so.6()(64bit) \
libQt6Xml.so.6(Qt_6)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libaubio.so.5()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjack.so.0()(64bit) \
liblilv-0.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libmad.so.0()(64bit) \
libogg.so.0()(64bit) \
librubberband.so.2()(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libvorbisfile.so.3()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
