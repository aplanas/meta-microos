SUMMARY = "Module name tools and transformations"
DESCRIPTION = "This module provides a few useful functions for manipulating module names. \
Its main aim is to centralise some of the functions commonly used by \
modules that manipulate other modules in some way, like converting module \
names to relative paths."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.09"

RPM_NAME = "perl-Module-Util-1.09-1.17.noarch.rpm"
RPM_HASH = "9ee951a50f232b2b1abf3d982a614d436d0a64e0a7443032c899291bbb76bd90d987ee3af7b2dc9de361c0e76aae81f918f9e45fdcb98be6ebcc9327e41f8b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Util \
perl-Module-Util"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
