SUMMARY = "Customisable application to read and write meta information in files"
DESCRIPTION = "ExifTool is a a full-featured application for reading and writing \
meta information in a wide variety of files, including the maker \
note information of many digital cameras by various manufacturers \
such as Canon, Casio, FujiFilm, GE, HP, JVC/Victor, Kodak, Leaf, \
Minolta/Konica-Minolta, Nikon, Olympus/Epson, Panasonic/Leica, \
Pentax/Asahi, Reconyx, Ricoh, Samsung, Sanyo, Sigma/Foveon and Sony."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "12.65"

RPM_NAME = "exiftool-12.65-1.1.noarch.rpm"
RPM_HASH = "c5b88622720971462b9cea027b72e72da69b9519a39389c24294ee7c4051df37eec4705890cbead6677ee1fa6df67173bb8a482b7154312532706a30053d8056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exiftool"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Image--ExifTool"

inherit rpm
