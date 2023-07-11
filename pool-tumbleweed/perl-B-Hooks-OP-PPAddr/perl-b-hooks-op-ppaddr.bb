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

RPM_NAME = "perl-B-Hooks-OP-PPAddr-0.06-1.31.aarch64.rpm"
RPM_HASH = "4ba933efaf456cae9aa1241d34f37083cde456e7b7b5d1d424ef6626ac3b45d52a58d2059a191b0b7f295bd400c98d8e2fa6f79a7815fb5e54768299e57cd2ed"

RPROVIDES:${PN} += "perl-B--Hooks--OP--PPAddr \
perl-B--Hooks--OP--PPAddr--Install--Files \
perl-B-Hooks-OP-PPAddr"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
