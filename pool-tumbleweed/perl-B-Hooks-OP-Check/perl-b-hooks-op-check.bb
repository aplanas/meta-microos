SUMMARY = "Wrap OP check callbacks"
DESCRIPTION = "This module provides a C API for XS modules to hook into the callbacks of \
'PL_check'. \
 \
ExtUtils::Depends is used to export all functions for other XS modules to \
use. Include the following in your Makefile.PL: \
 \
    my $pkg = ExtUtils::Depends->new('Your::XSModule', 'B::Hooks::OP::Check'); \
    WriteMakefile( \
        ... # your normal makefile flags \
        $pkg->get_makefile_vars, \
    ); \
 \
Your XS module can now include 'hook_op_check.h'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.22"

RPM_NAME = "perl-B-Hooks-OP-Check-0.22-1.31.aarch64.rpm"
RPM_HASH = "9f751a725f052c2411aa28e6fc5a25705a5ff3cec76cd9af63e0ca12442f02cb8bd5c879d5ea86f7386896ad6ba8109499f8687a1aa07e6408602ac2367bfed3"

RPROVIDES:${PN} += "perl-B--Hooks--OP--Check \
perl-B--Hooks--OP--Check--Install--Files \
perl-B-Hooks-OP-Check"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
