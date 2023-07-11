SUMMARY = "Perl interface for the MusicBrainz libdiscid library"
DESCRIPTION = "MusicBrainz::DiscID is a class to calculate a MusicBrainz DiscID from an \
audio CD in the drive."
LICENSE = "MIT"

PV = "0.06"

RPM_NAME = "perl-MusicBrainz-DiscID-0.06-1.20.aarch64.rpm"
RPM_HASH = "82934c4ee09d0252905a9c5f2a6434abdbd0c385ab17c0c3fbc438e567c6c3d3be89e673c6c566ad2db0f26f36721012e48bdc29ef6fc76ed38f853239f77ff8"

RPROVIDES:${PN} += "perl-MusicBrainz--DiscID \
perl-MusicBrainz-DiscID"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdiscid.so.0 \
perl--MODULE-COMPAT-5.36.1 \
perl-Carp \
perl-XSLoader"

inherit rpm
