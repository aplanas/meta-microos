SUMMARY = "Determine MIME types of data or files using libmagic"
DESCRIPTION = "The 'File::LibMagic' module is a simple perl interface to libmagic from the \
file package (version 4.x or 5.x). You will need both the library \
(_libmagic.so_) and the header file (_magic.h_) to build this Perl module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.23"

RPM_NAME = "perl-File-LibMagic-1.23-1.17.aarch64.rpm"
RPM_HASH = "11b392b2bd38eeb4f8622e34716439b3db45f6740c77375f2ce67c57efd91d9f0b65836664a18501f4e707d5b1d17cb8f1204475d526d4930e4396b821220ce2"

RPROVIDES:${PN} += "perl-File--LibMagic \
perl-File--LibMagic--Constants \
perl-File-LibMagic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
