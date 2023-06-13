SUMMARY = "Virtual Pipe Organ Software"
DESCRIPTION = "GrandOrgue is a virtual pipe organ sample player application supporting a HW1 compatible file format."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.0"

RPM_NAME = "grandorgue-3.12.0-1.1.aarch64.rpm"
RPM_HASH = "a22ae18ecdfdb684db9267d4db37605a4d629fd373aa6b6103ed16d387adfde413548ed8f2c2151ab6ed0133fc584ea0defc3699920ed5b5375bc43370685beb"

RPROVIDES:${PN} += "application() \
application(GrandOrgue.desktop) \
grandorgue \
grandorgue(aarch-64) \
libGrandOrgueCore.so.3.11.3()(64bit) \
libGrandOrgueImages.so.3.11.3()(64bit) \
metainfo() \
metainfo(GrandOrgue.appdata.xml) \
mimehandler(application/x-grandorgue-odf)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libportaudio.so.2()(64bit) \
librtaudio.so.6()(64bit) \
librtmidi.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwavpack.so.1()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse.so.9.0.0()(64bit) \
libyaml-cpp.so.0.7()(64bit) \
libz.so.1()(64bit) \
libzita-convolver.so.4()(64bit)"

inherit rpm
