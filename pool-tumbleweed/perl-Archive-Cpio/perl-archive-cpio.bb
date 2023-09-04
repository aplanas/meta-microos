SUMMARY = "Module for Manipulations of Cpio Archives"
DESCRIPTION = "Archive::Cpio provides a few functions to read and write cpio files."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.10"

RPM_NAME = "perl-Archive-Cpio-0.10-1.25.noarch.rpm"
RPM_HASH = "840d1839900837bd8f02e64891c95a9c06128a2c6541c177898be1a4201b08fde896df11fd0498174007054b804201d89dd2ea883f2913ca4f4f5c8a154101a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Cpio \
perl-Archive--Cpio--Common \
perl-Archive--Cpio--File \
perl-Archive--Cpio--FileHandle-with-pushback \
perl-Archive--Cpio--NewAscii \
perl-Archive--Cpio--ODC \
perl-Archive--Cpio--OldBinary \
perl-Archive-Cpio"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
