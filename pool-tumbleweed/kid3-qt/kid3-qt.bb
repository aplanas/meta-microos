SUMMARY = "Efficient ID3 Tag Editor"
DESCRIPTION = "With Kid3 you can: \
  - Edit ID3v1.1 tags \
  - Edit all ID3v2.3 and ID3v2.4 frames \
  - Convert between ID3v1.1, ID3v2.3 and ID3v2.4 tags \
  - Edit tags in MP3, Ogg/Vorbis, FLAC, MPC, APE, MP4/AAC, MP2, Speex, \
    TrueAudio, WavPack, WMA, WAV, AIFF files and tracker modules (MOD, \
    S3M, IT, XM). \
  - Edit tags of multiple files, e.g. the artist, album, year and genre \
    of all files of an album typically have the same values and can be \
    set together. \
  - Generate tags from filenames \
  - Generate tags from the contents of tag fields \
  - Generate filenames from tags \
  - Generate playlist files \
  - Automatic case conversion and string translation \
  - Import and export album data \
  - Import from gnudb.org, TrackType.org, MusicBrainz, Discogs, Amazon \
 \
This package does not use KDE libraries, if you use KDE you should use kid3. \
For a commandline interface you can use kid3-cli."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-qt-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "1717c2c147ebb5fa8e019be8c17eb36edba86a0ca5cbb9d0f372fc8215b46b8391fefdb1a4a28a24e03d01f68dda8d68c5d03ef4f51f91258555fb7a8cc0c633"

RPROVIDES:${PN} += "kid3-qt"

RDEPENDS:${PN} += "kid3-core \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkid3-core.so \
libkid3-gui.so \
libstdc++.so.6 \
xdg-utils"

inherit rpm
