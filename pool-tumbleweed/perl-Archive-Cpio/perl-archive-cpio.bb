SUMMARY = "Module for Manipulations of Cpio Archives"
DESCRIPTION = "Archive::Cpio provides a few functions to read and write cpio files."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.10"

RPM_NAME = "perl-Archive-Cpio-0.10-1.23.noarch.rpm"
RPM_HASH = "68a8043f1ae9280c5b4f243b624aab02f0879abb95ee098bdb32e7a0193c40d564e28b47f01e090d4bad2937c8e0298adff15641017056fb7580aa4813b4b29f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Archive::Cpio) \
perl(Archive::Cpio::Common) \
perl(Archive::Cpio::File) \
perl(Archive::Cpio::FileHandle_with_pushback) \
perl(Archive::Cpio::NewAscii) \
perl(Archive::Cpio::ODC) \
perl(Archive::Cpio::OldBinary) \
perl-Archive-Cpio"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
