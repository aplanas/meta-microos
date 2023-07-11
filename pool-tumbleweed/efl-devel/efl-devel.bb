SUMMARY = "Headers, pkgconfig files and other files for development with EFL"
DESCRIPTION = "Headers, pkgconfig files and other files needed for development with EFL."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-devel-1.26.3-30.8.aarch64.rpm"
RPM_HASH = "f0aff2389dd91ee493028ec712dcfa32eb02b0575fe0f471db66a12c5ef1dd0929e12c205ee3b969922aaa138a21ed402524b1f23d9bab758854850af2218e46"

RPROVIDES:${PN} += "cmake-Ecore \
cmake-EcoreCxx \
cmake-Edje \
cmake-Eet \
cmake-EetCxx \
cmake-Eeze \
cmake-Efl \
cmake-Efreet \
cmake-Eina \
cmake-EinaCxx \
cmake-Eio \
cmake-Eldbus \
cmake-Elementary \
cmake-Elua \
cmake-Emile \
cmake-Emotion \
cmake-Eo \
cmake-EoCxx \
cmake-Eolian \
cmake-EolianCxx \
cmake-Ethumb \
cmake-EthumbClient \
cmake-Evas \
cmake-EvasCxx \
ecore-devel \
edbus-devel \
edje-devel \
eet-devel \
eeze-devel \
efl-devel \
efreet-devel \
eina-devel \
eio-devel \
elementary-devel \
embryo-devel \
emotion-devel \
emotion-generic-players-devel \
eo-devel \
ephysics-devel \
ethumb-devel \
evas-devel \
evas-generic-loaders-devel \
libeo-dbg.so.1 \
pkgconfig-ecore \
pkgconfig-ecore-audio \
pkgconfig-ecore-con \
pkgconfig-ecore-cxx \
pkgconfig-ecore-drm2 \
pkgconfig-ecore-evas \
pkgconfig-ecore-fb \
pkgconfig-ecore-file \
pkgconfig-ecore-imf \
pkgconfig-ecore-imf-evas \
pkgconfig-ecore-input \
pkgconfig-ecore-input-evas \
pkgconfig-ecore-ipc \
pkgconfig-ecore-wl2 \
pkgconfig-ecore-x \
pkgconfig-ector \
pkgconfig-edje \
pkgconfig-edje-cxx \
pkgconfig-eet \
pkgconfig-eet-cxx \
pkgconfig-eeze \
pkgconfig-efl \
pkgconfig-efl-canvas-wl \
pkgconfig-efl-core \
pkgconfig-efl-cxx \
pkgconfig-efl-net \
pkgconfig-efl-ui \
pkgconfig-efreet \
pkgconfig-efreet-mime \
pkgconfig-efreet-trash \
pkgconfig-eina \
pkgconfig-eina-cxx \
pkgconfig-eio \
pkgconfig-eio-cxx \
pkgconfig-eldbus \
pkgconfig-eldbus-cxx \
pkgconfig-elementary \
pkgconfig-elementary-cxx \
pkgconfig-elput \
pkgconfig-embryo \
pkgconfig-emile \
pkgconfig-emotion \
pkgconfig-eo \
pkgconfig-eo-cxx \
pkgconfig-eolian \
pkgconfig-eolian-cxx \
pkgconfig-ephysics \
pkgconfig-ethumb \
pkgconfig-ethumb-client \
pkgconfig-evas \
pkgconfig-evas-cxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
efl \
gettext-devel \
giflib-devel \
glibc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecore-con.so.1 \
libecore-evas.so.1 \
libecore-file.so.1 \
libecore-input.so.1 \
libecore.so.1 \
libedje.so.1 \
libefl.so.1 \
libefreet.so.1 \
libeina.so.1 \
libeio.so.1 \
libelementary.so.1 \
libeo.so.1 \
libevas.so.1 \
libm.so.6 \
pkgconfig-bullet \
pkgconfig-dbus-1 \
pkgconfig-dri \
pkgconfig-ecore \
pkgconfig-ecore-audio \
pkgconfig-ecore-con \
pkgconfig-ecore-cxx \
pkgconfig-ecore-drm2 \
pkgconfig-ecore-evas \
pkgconfig-ecore-file \
pkgconfig-ecore-imf \
pkgconfig-ecore-imf-evas \
pkgconfig-ecore-input \
pkgconfig-ecore-input-evas \
pkgconfig-ecore-ipc \
pkgconfig-ecore-wl2 \
pkgconfig-ecore-x \
pkgconfig-ector \
pkgconfig-edje \
pkgconfig-edje-cxx \
pkgconfig-eet \
pkgconfig-eet-cxx \
pkgconfig-eeze \
pkgconfig-efl \
pkgconfig-efl-cxx \
pkgconfig-efreet \
pkgconfig-efreet-mime \
pkgconfig-efreet-trash \
pkgconfig-egl \
pkgconfig-eina \
pkgconfig-eina-cxx \
pkgconfig-eio \
pkgconfig-eio-cxx \
pkgconfig-eldbus \
pkgconfig-eldbus-cxx \
pkgconfig-elementary \
pkgconfig-elput \
pkgconfig-embryo \
pkgconfig-emile \
pkgconfig-emotion \
pkgconfig-eo \
pkgconfig-eo-cxx \
pkgconfig-eolian \
pkgconfig-eolian-cxx \
pkgconfig-ephysics \
pkgconfig-ethumb \
pkgconfig-ethumb-client \
pkgconfig-evas \
pkgconfig-evas-cxx \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-fribidi \
pkgconfig-glesv2 \
pkgconfig-glib-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-plugins-base-1.0 \
pkgconfig-harfbuzz \
pkgconfig-libcurl \
pkgconfig-libexif \
pkgconfig-libinput \
pkgconfig-libjpeg \
pkgconfig-libpng \
pkgconfig-libpulse \
pkgconfig-librsvg-2.0 \
pkgconfig-libtiff-4 \
pkgconfig-libudev \
pkgconfig-libunwind-generic \
pkgconfig-libxine \
pkgconfig-luajit \
pkgconfig-mount \
pkgconfig-openssl \
pkgconfig-pixman-1 \
pkgconfig-sdl \
pkgconfig-sndfile \
pkgconfig-wayland-client \
pkgconfig-wayland-server \
pkgconfig-x11 \
pkgconfig-x11-xcb \
pkgconfig-xcb \
pkgconfig-xcomposite \
pkgconfig-xcursor \
pkgconfig-xdmcp \
pkgconfig-xext \
pkgconfig-xi \
pkgconfig-xinerama \
pkgconfig-xkbcommon \
pkgconfig-xkbcommon-x11 \
pkgconfig-xp \
pkgconfig-xproto \
pkgconfig-xrandr \
pkgconfig-xscrnsaver \
pkgconfig-xtst \
pkgconfig-zlib"

inherit rpm
