SUMMARY = "Perl module for reading/writing/modifying complete files"
DESCRIPTION = "This module provides subs that allow you to read or write entire files with \
one simple call. They are designed to be simple to use, have flexible ways \
to pass in or get the file contents and to be very efficient. There is also \
a sub to read in all the files in a directory."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "9999.32"

RPM_NAME = "perl-File-Slurp-9999.32-1.15.noarch.rpm"
RPM_HASH = "0d570098fb492024ebcd5a66f8b7b1b9518a51d4a61a1f4523e3691bee2eae6d238abfcc4a270233c6a1ea21a3a60612c0a6bece34c3646e45495a0deb86ae06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp \
perl-File-Slurp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
