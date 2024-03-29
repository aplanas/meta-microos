SUMMARY = "A platform independent GUI for the Apple iPod"
DESCRIPTION = "gtkpod is a Platform-Independent GUI for the Apple iPod using GTK2. It \
allows you to upload songs and play lists to your iPod. It supports ID3 \
tag editing with multiple charsets for ID3 tags, detects duplicate \
songs, allows offline modification of the database with later \
synchronization, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "gtkpod-2.1.5-6.19.aarch64.rpm"
RPM_HASH = "4c7f944dfdb2daa09625c66ab9690efef257abf9f73121834d514285ee759fef65ee6e4bf4505a8afdb9af27774c8e1aa9829a25e8aa251d4aabd4f6d4640f7c"

RPROVIDES:${PN} += "gtkpod \
libclarity.so \
libcore-prefs.so \
libcover-display.so \
libdetails-editor.so \
libexporter.so \
libexternal-player.so \
libfiletype-flac.so \
libfiletype-mp3.so \
libfiletype-mp4.so \
libfiletype-ogg.so \
libfiletype-video.so \
libfiletype-wav.so \
libinfo-display.so \
libmedia-player.so \
libmserv.so \
libphoto-editor.so \
libplaylist-display.so \
librepository-editor.so \
libsjcd.so \
libsorttab-display.so \
libtrack-display.so"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libanjuta-3.so.0 \
libatk-1.0.so.0 \
libatomicparsley.so.0 \
libbrasero-media3.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libcogl.so.20 \
libcurl.so.4 \
libdiscid.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdl-3.so.5 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgtkpod.so.1 \
libid3tag.so.0.16.2 \
libmusicbrainz5.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libvorbisfile.so.3"

inherit rpm
