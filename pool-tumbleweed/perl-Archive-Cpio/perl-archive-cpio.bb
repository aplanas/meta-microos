SUMMARY = "Module for Manipulations of Cpio Archives"
DESCRIPTION = "Archive::Cpio provides a few functions to read and write cpio files."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.10"

RPM_NAME = "perl-Archive-Cpio-0.10-1.24.noarch.rpm"
RPM_HASH = "8dca3df5bf988a17c2ffbc13b44e52abf9fd225b132430ba0bfa57762b0d83126a4544a2d590c1dd023c7d82bf765078d23fd379d7ffe5ff6b3a64b591ba1138"
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
perl--MODULE-COMPAT-5.36.1"

inherit rpm
