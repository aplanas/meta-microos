SUMMARY = "Plugins for Pragha"
DESCRIPTION = "This package includes plugins for the Pragha player. \
 \
* AcoustID - Get metadata on AcoustID service. \
* Ampache - Append music on Ampache server. \
* CD-ROM - Play Audio CDs. \
* Devices - Management removable devices. \
* DLNA Server - Share your playlist on a DLNA server. \
* DLNA Renderer - Play music on a DLNA server. \
* Global Hotkeys - Control Pragha with multimedia keys. \
* Global Hotkeys with gnome-media-keys daemon - Control Pragha with \
  gnome-media-keys daemon. \
* Koel - Append music on Koel server. \
* Last.fm - Scrobbling, love, unlove song and append similar song to get \
  related playlists. \
* MPRIS2 - Control Pragha with MPRIS2 interface. \
* MTP Devices - Management MTP devices. \
* Notification - Show notification when change songs. \
* Removable Media - Detect removable media and scan it. \
* Song Info - Get Artist info, Lyrics and Album arts of yours songs. \
* Get radios - Get radios on TuneIn."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-plugins-1.3.99.1-3.3.aarch64.rpm"
RPM_HASH = "706a75d8c96ee9fc1ae303369a3688d9d0c53877ce982da3616217bfd5fe87dd4f54c472fb9abe6810c33180587dc027c15b3d02885bfcd46681bb11c671988f"

RPROVIDES:${PN} += "libacoustid.so \
libcdrom.so \
libgnome-media-keys.so \
libkeybinder.so \
libmpris2.so \
libnotify.so \
libpampache.so \
libpdlnarenderer.so \
libpkoel.so \
libplastfm.so \
libpmtp.so \
libremovable.so \
libsong-info.so \
libtunein.so \
libvisualizer.so \
pragha-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcddb.so.2 \
libcdio-cdda.so.2 \
libcdio.so.19 \
libclastfm.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglyr.so.1 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libgrlnet-0.3.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libkeybinder-3.0.so.0 \
libm.so.6 \
libmtp.so.9 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpeas-1.0.so.0 \
libpragha.so \
libsoup-2.4.so.1 \
libxml2.so.2 \
pragha"

inherit rpm
