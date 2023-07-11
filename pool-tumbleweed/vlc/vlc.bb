SUMMARY = "Graphical media player"
DESCRIPTION = "VLC media player is a multimedia player for many \
audio and video files and formats (such as MPEG, DivX, mp3, ogg, ...) \
as well as DVDs, VCDs, and various streaming protocols. \
It can also be used as a server to stream in unicast or multicast \
in IPv4 or IPv6 on a high-bandwidth network."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-3.0.18-7.3.aarch64.rpm"
RPM_HASH = "abef031394fd7be4af4ebf829977cd672163f138a3f7488eb0e7376d250c9c3e6cbb498ca67df0da641fdbcdcfd937106d05b99bf232ab58c14b09bda26b64f2"

RPROVIDES:${PN} += "libaa-plugin.so \
libavcodec-plugin.so \
libavformat-plugin.so \
libavio-plugin.so \
libcaca-plugin.so \
libegl-wl-plugin.so \
libegl-x11-plugin.so \
libfreetype-plugin.so \
libglconv-vaapi-wl-plugin.so \
libglspectrum-plugin.so \
libglx-plugin.so \
liblibass-plugin.so \
libnotify-plugin.so \
libpacketizer-av1-plugin.so \
libpacketizer-avparser-plugin.so \
libpanoramix-plugin.so \
libpulse-plugin.so \
libpulselist-plugin.so \
libpulsesrc-plugin.so \
libskins2-plugin.so \
libstream-out-chromaprint-plugin.so \
libsvg-plugin.so \
libswscale-plugin.so \
libvlc-pulse.so.0 \
libvlc-xcb-events.so.0 \
libxcb-apps-plugin.so \
libxcb-hotkeys-plugin.so \
libxcb-screen-plugin.so \
libxcb-window-plugin.so \
libxcb-x11-plugin.so \
libxcb-xv-plugin.so \
vlc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXpm.so.4 \
libaa.so.1 \
libass.so.9 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libcaca.so.0 \
libcairo.so.2 \
libchromaprint.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libnotify.so.4 \
libpulse.so.0 \
librsvg-2.so.2 \
libstdc++.so.6 \
libswscale.so.5.9 \
libva-wayland.so.2 \
libva.so.2 \
libvlccore.so.9 \
libwayland-egl.so.1 \
libxcb-composite.so.0 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-shm.so.0 \
libxcb-xv.so.0 \
libxcb.so.1 \
vlc-noX \
vlc-qt"

inherit rpm
