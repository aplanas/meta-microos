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

RPROVIDES:${PN} += "paprefs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
pulseaudio-module-gsettings"

inherit rpm
