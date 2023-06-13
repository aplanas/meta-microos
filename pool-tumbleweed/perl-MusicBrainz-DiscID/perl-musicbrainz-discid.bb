SUMMARY = "Perl interface for the MusicBrainz libdiscid library"
DESCRIPTION = "MusicBrainz::DiscID is a class to calculate a MusicBrainz DiscID from an \
audio CD in the drive."
LICENSE = "MIT"

PV = "0.06"

RPM_NAME = "perl-MusicBrainz-DiscID-0.06-1.19.aarch64.rpm"
RPM_HASH = "b9a8a350793bd7cab7e6cd3f545f149b48730f9ed58040aade794b7b305a065ae4441e61ccfda8e1e1e4336e5346d29c92b22b7864e8f8b7d15124f0e57a436d"

RPROVIDES:${PN} += "perl(MusicBrainz::DiscID) \
perl-MusicBrainz-DiscID \
perl-MusicBrainz-DiscID(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdiscid.so.0()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Carp) \
perl(XSLoader)"

inherit rpm
