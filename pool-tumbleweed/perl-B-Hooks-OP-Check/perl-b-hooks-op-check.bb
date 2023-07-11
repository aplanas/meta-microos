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

RPM_NAME = "perl-B-Hooks-OP-Check-0.22-1.30.aarch64.rpm"
RPM_HASH = "06821c986de680b27da6e77d3f8bcbea5bce129093e3595be164cd6f287945a9e495d52acad82973f8d1b07c7a7458c927a08bf3e6d60b17214f6411e7fde5d6"

RPROVIDES:${PN} += "perl-B--Hooks--OP--Check \
perl-B--Hooks--OP--Check--Install--Files \
perl-B-Hooks-OP-Check"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
