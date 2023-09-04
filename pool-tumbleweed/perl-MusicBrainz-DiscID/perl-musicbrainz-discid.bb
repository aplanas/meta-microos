SUMMARY = "Perl interface for the MusicBrainz libdiscid library"
DESCRIPTION = "MusicBrainz::DiscID is a class to calculate a MusicBrainz DiscID from an \
audio CD in the drive."
LICENSE = "MIT"

PV = "0.06"

RPM_NAME = "perl-MusicBrainz-DiscID-0.06-1.21.aarch64.rpm"
RPM_HASH = "fafb376e7e989fd4156494d03c9d994779789e90122c5ba8f45c32ad3708ddecaec8ecc708706c16f5d811d3c4288f4e1c6a8ba6119a6ac566656e0c909d3e77"

RPROVIDES:${PN} += "perl-MusicBrainz--DiscID \
perl-MusicBrainz-DiscID"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdiscid.so.0 \
perl--MODULE-COMPAT-5.38.0 \
perl-Carp \
perl-XSLoader"

inherit rpm
