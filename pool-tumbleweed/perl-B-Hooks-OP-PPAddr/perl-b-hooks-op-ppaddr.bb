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

RPM_NAME = "perl-B-Hooks-OP-PPAddr-0.06-1.32.aarch64.rpm"
RPM_HASH = "4ad2af2c89eed0820cdbe2b7d89cdf7d900fab7c657a352be7256615ef6ff6485ecb716c18f2afd85601fb3cc280fb5b7336e266da10d0d0562b30440325b42a"

RPROVIDES:${PN} += "perl-B--Hooks--OP--PPAddr \
perl-B--Hooks--OP--PPAddr--Install--Files \
perl-B-Hooks-OP-PPAddr"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
