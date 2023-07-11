SUMMARY = "Perl module for reading/writing/modifying complete files"
DESCRIPTION = "This module provides subs that allow you to read or write entire files with \
one simple call. They are designed to be simple to use, have flexible ways \
to pass in or get the file contents and to be very efficient. There is also \
a sub to read in all the files in a directory."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "9999.32"

RPM_NAME = "perl-File-Slurp-9999.32-1.14.noarch.rpm"
RPM_HASH = "ee0b7b1e011e18172412a15e0b4c92ccd67da8ab86007e02b93387f25634ae101ab4099781ce18c7626b6f47828964c871f9784e4a823318b15ccaef0778afbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp \
perl-File-Slurp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
