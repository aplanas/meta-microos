SUMMARY = "Front-end program to a number of utilities for encoding a CD to files"
DESCRIPTION = "A front-end program to cdparanoia, wget, cd-discid, id3, and a \
custom Ogg or MP3 encoder, defaulting to oggenc. It grabs an entire CD \
and converts each track to Ogg or MP3, and then comments or adds ID3 \
tags to each file."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "abcde-2.9.3-5.8.noarch.rpm"
RPM_HASH = "5e620054118a1b4c016c2333c67c2659cb0c1cf02c04f708f60363b07fee2d3dfe80c6b5ba8365d43914f584cf85104486b119a00e8c3f616f98fbb30cc69729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abcde \
config-abcde"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
cd-discid \
cdparanoia \
perl-MusicBrainz--DiscID \
perl-WebService--MusicBrainz \
wget"

inherit rpm
