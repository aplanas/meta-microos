SUMMARY = "Check that a library is available"
DESCRIPTION = "Devel::CheckLib is a perl module that checks whether a particular C library \
and its headers are available."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.16"

RPM_NAME = "perl-Devel-CheckLib-1.16-1.7.aarch64.rpm"
RPM_HASH = "5df4b01077e0f56258b808f4bf25afdedf4c70b5a1735f2aa0db0d71d20ceea399879632ffd4c799fe61c703527085e09249f94ad2a2d6ea22e78511e3ffb9ae"

RPROVIDES:${PN} += "perl-Devel--CheckLib \
perl-Devel-CheckLib"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
