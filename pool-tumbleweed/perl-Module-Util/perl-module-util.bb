SUMMARY = "Module name tools and transformations"
DESCRIPTION = "This module provides a few useful functions for manipulating module names. \
Its main aim is to centralise some of the functions commonly used by \
modules that manipulate other modules in some way, like converting module \
names to relative paths."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.09"

RPM_NAME = "perl-Module-Util-1.09-1.16.noarch.rpm"
RPM_HASH = "ad4c930d455ab34e6c7de69e7cce94f3957f6d296da7da047ece029eb34be216e43972d22f4a71b78b7f705a34e9e9bf6da40f0018a383782ba2e4ab1dc2a31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Util \
perl-Module-Util"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
