SUMMARY = "Customisable application to read and write meta information in files"
DESCRIPTION = "ExifTool is a a full-featured application for reading and writing \
meta information in a wide variety of files, including the maker \
note information of many digital cameras by various manufacturers \
such as Canon, Casio, FujiFilm, GE, HP, JVC/Victor, Kodak, Leaf, \
Minolta/Konica-Minolta, Nikon, Olympus/Epson, Panasonic/Leica, \
Pentax/Asahi, Reconyx, Ricoh, Samsung, Sanyo, Sigma/Foveon and Sony."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "12.62"

RPM_NAME = "exiftool-12.62-1.1.noarch.rpm"
RPM_HASH = "0c119c232f8ba3a874b6a447910b5f852a96e1070a798784390cd1114ca94a70588efc026b63025f4c99b74b4abf268e8ac3d566a674d50e0c7c50f0a0fffb8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exiftool"
RDEPENDS:${PN} += "/usr/bin/perl perl(Image::ExifTool)"

inherit rpm
