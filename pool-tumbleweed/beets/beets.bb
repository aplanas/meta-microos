SUMMARY = "Music tagger and library organizer"
DESCRIPTION = "Beets is a media library management system for obsessive-compulsive music \
geeks. \
 \
The purpose of beets is to get a music collection right once and for all. \
It catalogs the collection, automatically improving its metadata as it goes. \
It then provides a bouquet of tools for manipulating and accessing the music. \
 \
beets is designed as a library, has a number of plugins which \
support these actions: \
 \
- Fetch or calculate all the metadata that could possibly be needed: \
  album art, lyrics, genres, tempos, ReplayGain levels, or acoustic \
  fingerprints. \
- Get metadata from MusicBrainz, Discogs, and Beatport, or guess \
  metadata using songs' filenames or their acoustic fingerprints. \
- Transcode audio to any format. \
- Check your library for duplicate tracks and albums or for albums that \
  are missing tracks. \
- Clean up crufty tags left behind by other tools. \
- Embed and extract album art from files' metadata. \
- Browse the music library graphically through a Web browser and play it in any \
  browser that supports HTML5 Audio. \
- Analyze music files' metadata from the command line. \
- Listen to your library with a music player that speaks the MPD protocol \
  and works with a variety of interfaces. \
 \
Writing additional plugins for beets is possible using Python."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "beets-1.6.0-3.1.noarch.rpm"
RPM_HASH = "7cd47134b3ab9b172f9ded8069fa5fe50de15927dc932aadad137efb62edd1ae840c9a6ce7c9c2ce87ec4a036abaa7b0e13947d8d3214e5cb830a4b0a1fbffe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beets \
python3.11dist-beets \
python3dist-beets"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-Unidecode \
python3-confuse \
python3-jellyfish \
python3-mediafile \
python3-munkres \
python3-musicbrainzngs"

inherit rpm
