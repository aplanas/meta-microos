SUMMARY = "PulseAudio Preferences"
DESCRIPTION = "PulseAudio Preferences (paprefs) is a simple GTK based configuration \
dialog for the PulseAudio sound server. \
 \
Please note that this program can only configure local servers, and \
requires that a special module module-gconf is loaded in the sound \
server."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "paprefs-1.2-1.7.aarch64.rpm"
RPM_HASH = "5f0116dc01cb0082d776234cca233639cf9eb83c08c49a205d06d5cd54a0598199e783927e7e2c156ba762b276b788f76bb35f86fab6aec2352ae609e452ee18"

RPROVIDES:${PN} += "application() \
application(paprefs.desktop) \
paprefs \
paprefs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
pulseaudio-module-gsettings"

inherit rpm
