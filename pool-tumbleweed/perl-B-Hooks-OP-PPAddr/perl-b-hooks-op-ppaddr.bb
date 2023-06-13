SUMMARY = "Hook into opcode execution"
DESCRIPTION = "This module provides a C API for XS modules to hook into the execution of \
perl opcodes. \
 \
ExtUtils::Depends is used to export all functions for other XS modules to \
use. Include the following in your _Makefile.PL_: \
 \
    my $pkg = ExtUtils::Depends->new('Your::XSModule', 'B::Hooks::OP::PPAddr'); \
    WriteMakefile( \
        ... # your normal makefile flags \
        $pkg->get_makefile_vars, \
    ); \
 \
Your XS module can now include 'hook_op_ppaddr.h'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-B-Hooks-OP-PPAddr-0.06-1.30.aarch64.rpm"
RPM_HASH = "73d5756c38b83ecb4e97b7a427d94d794897a441ea0d65d4696462b48a99ab887168100a396c2088802f28723917ff77c9f59459d0d1c51fdca47e14b0274d90"

RPROVIDES:${PN} += "perl(B::Hooks::OP::PPAddr) \
perl(B::Hooks::OP::PPAddr::Install::Files) \
perl-B-Hooks-OP-PPAddr \
perl-B-Hooks-OP-PPAddr(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(parent)"

inherit rpm
