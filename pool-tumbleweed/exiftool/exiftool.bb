SUMMARY = "Customisable application to read and write meta information in files"
DESCRIPTION = "ExifTool is a a full-featured application for reading and writing \
meta information in a wide variety of files, including the maker \
note information of many digital cameras by various manufacturers \
such as Canon, Casio, FujiFilm, GE, HP, JVC/Victor, Kodak, Leaf, \
Minolta/Konica-Minolta, Nikon, Olympus/Epson, Panasonic/Leica, \
Pentax/Asahi, Reconyx, Ricoh, Samsung, Sanyo, Sigma/Foveon and Sony."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "12.64"

RPM_NAME = "exiftool-12.64-1.1.noarch.rpm"
RPM_HASH = "f058f314ed634d61ac3a0efc74ddf35a37e5852612765f4c7fcf31f7cb1332d81b0665126139aba010aaadb83988cf87e72de29064c81b52dd53e6611c21ccaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exiftool"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Image--ExifTool"

inherit rpm
