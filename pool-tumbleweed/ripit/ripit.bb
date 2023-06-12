SUMMARY = "Perl Script to Create .ogg or .mp3 Files from an Audio CD"
DESCRIPTION = "This Perl script makes it easy to create MP3 files from an audio CD. It \
tries to find the artist and song titles with the help of CDDB."
LICENSE = "GPL-2.0+"

PV = "3.9.90"

RPM_NAME = "ripit-3.9.90-2.11.noarch.rpm"
RPM_HASH = "e36ee531728f8321eba15516f8f0e10cf41023b1d16650a28b62248a6a188597cdd7c584d7d0b02f1ee33340b204929dcd3efceb9b40f53d0916202801259794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(ripit) \
ripit"
RDEPENDS:${PN} += "/usr/bin/env \
cdparanoia \
perl-CDDB_get \
perl-libwww-perl \
vorbis-tools"

inherit rpm
