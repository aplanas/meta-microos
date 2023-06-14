SUMMARY = "Efficient ID3 Tag Editor"
DESCRIPTION = "f you want to easily tag multiple MP3, Ogg/Vorbis, Opus, DSF, FLAC, \
MPC, MP4/AAC, MP2, Opus, Speex, TrueAudio, WavPack and WMA files \
(e.g. full albums) without typing the same information again and \
again and have control over both ID3v1 and ID3v2 tags, \
then Kid3 is the program you are looking for. \
 \
With Kid3 you can: \
- Edit ID3v1.1 tags \
- Edit all ID3v2.3 and ID3v2.4 frames \
- Convert between ID3v1.1, ID3v2.3 and ID3v2.4 tags \
- Edit tags in MP3, Ogg/Vorbis, FLAC, MPC, MP4/AAC, MP2, Speex, \
  TrueAudio, WavPack, WMA, AIFF and WAV files \
- Edit tags of multiple files, e.g. the artist, album, year and \
  genre of all files of an album typically have the same values \
  and can be set together. \
- Generate tags from filenames \
- Generate tags from the contents of tag fields \
- Generate filenames from tags \
- Rename and create directories from tags \
- Generate playlist files \
- Automatically convert upper and lower case and replace strings \
- Import from freedb2.org, MusicBrainz, Discogs, Amazon and other \
  sources of album data \
- Export tags as CSV, HTML, playlists, Kover XML and in other formats \
- Edit synchronized lyrics and event timing codes,import and export LRC files \
 \
This package uses KDE libraries, if you do not use KDE you should use kid3-qt. \
For a commandline interface you can use kid3-cli."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "e5c60b500e88b1de7bbf9f2d9f772da18a088602144d6cdb66d63c28a79c87e67d1005c7b7c3445c7ddf7c833bb00b5598075450332ea7068782cab1d1568d7d"

RPROVIDES:${PN} += "kid3"

RDEPENDS:${PN} += "kid3-core \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkid3-core.so \
libkid3-gui.so \
libstdc++.so.6 \
libxslt-tools \
xdg-utils"

inherit rpm
