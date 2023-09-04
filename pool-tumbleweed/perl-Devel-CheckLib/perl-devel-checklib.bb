SUMMARY = "Check that a library is available"
DESCRIPTION = "Devel::CheckLib is a perl module that checks whether a particular C library \
and its headers are available."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.16"

RPM_NAME = "perl-Devel-CheckLib-1.16-1.8.aarch64.rpm"
RPM_HASH = "6a141344e3305c919301810a4794bb009b247a2816b2d1b9cfd7e0d7104d275ab16020453754f242a9fb40fdfd15b0003366f0c9373a8a34dc4e20b961e6854c"

RPROVIDES:${PN} += "perl-Devel--CheckLib \
perl-Devel-CheckLib"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
