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
This package contains a command line interface for Kid3, for a GUI you can \
use kid3-qt or kid3."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-cli-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "46e6a7d3944a5db5e291ef18a30e6de8654c883abe39b864ed6500e22b5f0e2e0017afae80a3a40892a2e3420ad19f0e2e2ee6d9ccb49096c8e761442824e628"

RPROVIDES:${PN} += "kid3-cli"

RDEPENDS:${PN} += "kid3-core \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkid3-core.so \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
