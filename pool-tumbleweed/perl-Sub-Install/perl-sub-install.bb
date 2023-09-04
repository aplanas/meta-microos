SUMMARY = "Install subroutines into packages easily"
DESCRIPTION = "This module makes it easy to install subroutines into packages without the \
unsightly mess of 'no strict' or typeglobs lying about where just anyone \
can see them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.929"

RPM_NAME = "perl-Sub-Install-0.929-1.4.noarch.rpm"
RPM_HASH = "a64cdc6c235b168bbd256a9a8dc43c7fcdf5658507c800bef390cd0ea7bfc541dbca0bc43de4b97636558b3fc8fb59fb8dabae3fe064f4db2db163940dcf2f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Install \
perl-Sub-Install"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
