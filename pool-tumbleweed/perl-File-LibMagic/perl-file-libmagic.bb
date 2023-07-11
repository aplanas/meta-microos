SUMMARY = "Determine MIME types of data or files using libmagic"
DESCRIPTION = "The 'File::LibMagic' module is a simple perl interface to libmagic from the \
file package (version 4.x or 5.x). You will need both the library \
(_libmagic.so_) and the header file (_magic.h_) to build this Perl module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.23"

RPM_NAME = "perl-File-LibMagic-1.23-1.16.aarch64.rpm"
RPM_HASH = "c050f036fae1ab60ff461d635d8f1b666f5e58607ae701621119aeb4a664ed2d95a5ff65d7f2d75660424feb4cf7fcb2bb178755f9563bb29fe117599ba98595"

RPROVIDES:${PN} += "perl-File--LibMagic \
perl-File--LibMagic--Constants \
perl-File-LibMagic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
