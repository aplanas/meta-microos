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

RPM_NAME = "kid3-cli-3.9.3-1.4.aarch64.rpm"
RPM_HASH = "10e5a61a93c3b5f754a2e0b9e528e0d32617fb05c9d8cc40af27ecdc93f482da67e8511e534453104a3d46a54632716281b4b475547802167cb5c574d6a85f55"

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
