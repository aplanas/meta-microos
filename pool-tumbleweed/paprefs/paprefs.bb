SUMMARY = "PulseAudio Preferences"
DESCRIPTION = "PulseAudio Preferences (paprefs) is a simple GTK based configuration \
dialog for the PulseAudio sound server. \
 \
Please note that this program can only configure local servers, and \
requires that a special module module-gconf is loaded in the sound \
server."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "paprefs-1.2-1.8.aarch64.rpm"
RPM_HASH = "11a95f6938ddd2c5ffa449430ea0fdcd8b1da9888a4985ba82c10a6ecfbf22a5eeb9d529c4c7725b10677483b439790dbaabbb24563626a3b6a8cdc2ab7fc09f"

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
